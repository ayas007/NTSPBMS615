package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;

public class CyclicDITest {

	public static void main(String[] args) {

//create ioc container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContaxt.xml");
		//Spring bean class obj
		A oa=factory.getBean("a1",A.class);
		System.out.println(oa);

	}

}
