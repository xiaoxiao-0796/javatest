package com.xiaofei.dubbocli;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextHelper implements ApplicationContextAware{
	
	private static ApplicationContext context;
	
	private static ApplicationContext getContext(){
		return SpringContextHelper.context;
	}

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		if(SpringContextHelper.context==null){
			SpringContextHelper.context = context;
		}
		System.out.println(SpringContextHelper.context);
	}
	
	public static Object getBean(String beanname){
		return getContext().getBean(beanname);
	}
	
	

}
