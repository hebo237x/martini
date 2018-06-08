package com.hebo.controller;

import com.hebo.common.ErrorCodeEnum;
import com.hebo.common.MartiniResult;
import com.hebo.common.YimiBizException;
import com.hebo.entity.Test;
import com.hebo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
        return MartiniResult.success(userService.findUserById(id));
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public MartiniResult<User> updateUser(@Validated @RequestBody User user){
        if (user.getId()==12){
            throw new YimiBizException(ErrorCodeEnum.IDERROR);
        }
        userService.update(user);
        return MartiniResult.success(null);
    }

    @RequestMapping(value = "/addQ",method = RequestMethod.GET)
    public MartiniResult<Void> findUserById(){
        for (int i=0;i<1000;i++){
            rabbitTemplate.convertAndSend("hello","消息:"+i);
        }
        return MartiniResult.success(null);
    }

    @RequestMapping(value = "/update/test",method = RequestMethod.POST)
    public MartiniResult<User> updateTest(@RequestBody Test test){
        testService.update(test);
        return MartiniResult.success(null);
    }

    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public MartiniResult<Test> findById(@PathVariable("id") long id){
        return MartiniResult.success(testService.findById(id));
    }
}
