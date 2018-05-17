package com.nantian.boot;

import com.nantian.boot.entry.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HellowordApplicationTests {
	
	@Value("${name1}")
	private String name1;
	@Value("${name2}")
	private String name2;
	@Value("${name3}")
	private String name3;
	@Autowired
	private Person person;
	@Autowired
	private ApplicationContext alc;

	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void contextLoads() {
		/*System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		*/
		System.out.println(person);
	}
	@Test
	public void testHelloService() {
		
		System.out.println(alc.containsBean("helloService"));
	}
	@Test
	public void testHelloService2() {
		
		System.out.println(alc.containsBean("helloService2"));
	}

	@Test
	public void testLog(){
		//日志的级别：
		//从高到低 trace<debug<info<warn<error
		//日志只会输出设置的最小级别及其以上级别的日志
		logger.trace("这是trace日志...");
		logger.debug("这是debug日志...");
		//StringBoot默认日志输出级别为info
		logger.info("这是info日志...");
		logger.warn("这是warn日志...");
		logger.error("这是error日志...");
	}
}
