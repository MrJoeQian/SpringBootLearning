package com.nantian.boot.entry;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor // 无参构造器
@AllArgsConstructor // 全参构造器
@Data
// chain=true set方法返回值为this 而不是void
@Accessors(chain = true)
//@PropertySource只支持加载properties文件
@PropertySource(value = { "classpath:person.properties" })
@Component
@ConfigurationProperties(prefix = "person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	@Email
	private String name;
	private int age;
	private Date birth;
	private Map<String, String> map;
	private List<Object> list;
	private Dog dog;

}
