package com.kmc.setters;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSetters {

	public static void main(String[] args) 
	{
		
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("com/kmc/setters/setconfig.xml");
		SetterInjection setterInjection=(SetterInjection) classPathXmlApplicationContext.getBean("set");
		
//		 Resource resource=new ClassPathResource("setconfig.xml");  
//	    BeanFactory factory=new XmlBeanFactory(resource);  
//	   SetterInjection setterInjection= (SetterInjection) factory.getBean("set");
	System.out.println("id : "+setterInjection.getEid());
	System.out.println("name : "+setterInjection.getEname());
		
		
		
	}

}
