package com.chris.mybatisdemo.service.impl;


import com.chris.mybatisdemo.entity.AutoIncrementEntity;
import com.chris.mybatisdemo.mapper.AutoIncrementMapper;
import com.chris.mybatisdemo.service.AutoIncrementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chris on 2017/12/4.
 */

@Service
public class AutoIncrementServiceImpl implements AutoIncrementService {

    @Autowired
    private AutoIncrementMapper mAutoIncrementEntityMapper;

    @Override
    public int insertData(AutoIncrementEntity autoIncrementEntity) throws Exception {
        return mAutoIncrementEntityMapper.insertData(autoIncrementEntity);
    }

    @Override
    public AutoIncrementEntity selectData(Long id) throws Exception {
        return mAutoIncrementEntityMapper.selectData(id);
    }

    @Override
    public int deleteData(Long id) throws Exception {
        return mAutoIncrementEntityMapper.deleteData(id);
    }

    @Override
    public int updateData(AutoIncrementEntity autoIncrementEntity) throws Exception {
        return mAutoIncrementEntityMapper.updateData(autoIncrementEntity);
    }

    @Override
    public List<AutoIncrementEntity> getList(String name) throws Exception {
        return mAutoIncrementEntityMapper.getList(name);
    }
}