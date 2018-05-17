package com.nantian.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.nantian.boot.entry.Person;

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
}
