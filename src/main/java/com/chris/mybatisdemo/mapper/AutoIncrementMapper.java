package com.chris.mybatisdemo.mapper;


import com.chris.mybatisdemo.entity.AutoIncrementEntity;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Chris on 2017/12/4.
 */

@Repository
public interface AutoIncrementMapper {
    int insertData(AutoIncrementEntity autoIncrementEntity) throws Exception;
    AutoIncrementEntity selectData(Long id) throws Exception;
    int deleteData(Long id) throws Exception;
    int updateData(AutoIncrementEntity autoIncrementEntity) throws Exception;
    List<AutoIncrementEntity> getList(String name) throws Exception;
}
