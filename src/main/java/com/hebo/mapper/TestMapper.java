package com.hebo.mapper;

import com.hebo.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by hebo on 2018/6/4.
 */
@Mapper
public interface TestMapper {
    Test findById(@Param("id") long id);

    void update(Test test);

}
