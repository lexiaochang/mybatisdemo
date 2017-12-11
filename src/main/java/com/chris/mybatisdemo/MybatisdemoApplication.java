package com.chris.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/restview")
@MapperScan("com.chris.mybatisdemo")//告诉mapper所在的包名
public class MybatisdemoApplication {
	@Value(value = "${book.author}")
	private String bookAuthor;

	@Value("${book.name}")
	private String bookName;

	@Value("${book.pinyin}")
	private String bookPinYin;

	public static void main(String[] args) {
		SpringApplication.run(MybatisdemoApplication.class, args);
	}

	@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
	String index() {
		return "Hello Spring Boot!";
	}


	@RequestMapping(value = "/chris", produces = "text/plain;charset=UTF-8")
	String test() {
		return "Hello Spring Boot! The BookName is " + bookName + ";and Book Author is " + bookAuthor + ";and Book PinYin is " + bookPinYin;
	}

}
