package com.hebo.common;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by hebo on 2018/4/3.
 */
@Component
public class RedisUtils {

    private final RedisTemplate redisTemplate;

    @Autowired
    public RedisUtils(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public <T> T getObject(String key, Class<T> clazz) {
        byte[] bytes = (byte[]) redisTemplate.execute(con -> con.get(key.getBytes()), true);
        return ArrayUtils.isEmpty(bytes) ? null : JSON.parseObject(bytes, clazz);
    }

    public String getString(String key) {
        byte[] bytes = (byte[]) redisTemplate.execute(con -> con.get(key.getBytes()), true);
        return ArrayUtils.isEmpty(bytes) ? null : new String(bytes);
    }

}
