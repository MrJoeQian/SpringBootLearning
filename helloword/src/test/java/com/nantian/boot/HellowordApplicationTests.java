package com.nantian.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nantian.boot.entry.Persion;

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
	private Persion persion;
	
	@Test
	public void contextLoads() {
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(persion);
	}

}
