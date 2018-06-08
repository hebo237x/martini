package com.hebo.service;

import com.hebo.entity.Test;
import com.hebo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by hebo on 2018/6/4.
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    @Cacheable(keyGenerator ="wiselyKeyGenerator" )
    public Test findById(long userId){
        return testMapper.findById(userId);
    }

    @CachePut
    public void update(Test test){
        testMapper.update(test);
    }
}
