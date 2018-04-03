package com.hebo.controller;

import com.hebo.common.MartiniResult;
import com.hebo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hebo on 2018/4/2.
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController{

    public static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/findUser/{id}",method = RequestMethod.GET)
    public MartiniResult<User> findUserById(@PathVariable("id") long id){
        String a = redisUtils.getString("test");
        logger.info("findUserById start:{}",a);
        return MartiniResult.success(userService.findUserById(id));
    }

}
