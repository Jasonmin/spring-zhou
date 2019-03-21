package com.forezp;

import com.forezp.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

//	public  static  Logger logger = LoggerFactory.getLogger(SpringbootMybatisApplicationTests.class);

	@Test
	public void contextLoads() {
	}

	@Autowired
	RedisDao redisDao;
	@Test
	public void testRedis() {

		System.out.println("==nothing");

		redisDao.setKey("user","zhouqiang");
		redisDao.setKey("friend","zhoujie");

		System.out.println(redisDao.getValue("user"));

		System.out.println(redisDao.getValue("friend"));
	}

}
