package com.xaiofei.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/28 0028 ProjectName: javatest
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathResource res = new ClassPathResource("beans.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
        People people = factory.getBean("people", People.class);
        System.out.println(people);
    }
}
