package com.hebo.mapper;

import com.hebo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User findUserById(@Param("id") long id);

    void update(User user);

}
