package com.nantian.boot.component;

import java.util.Map;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
@Component
public class MyErrorAttributes extends DefaultErrorAttributes{

	@Override
	public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
		Map<String, Object> errorAttributes = super.getErrorAttributes(requestAttributes, includeStackTrace);
		//设置自定义消息
		errorAttributes.put("company", "nantian");
		return errorAttributes;
	}

}
