package cn.akeem.service;

import cn.akeem.redis.HashRedisServiceImpl;
import cn.akeem.mapper.VisitorMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: zhangocean
 * @Date: 2019/5/6 14:30
 * Describe:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    HashRedisServiceImpl hashRedisService;
    @Autowired
    VisitorMapper visitorMapper;

    @Test
    public void redisTest(){
    }

}
