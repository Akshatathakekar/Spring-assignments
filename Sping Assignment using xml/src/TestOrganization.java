package com.capgemini.spring.test;

import com.capgemini.spring.*;
import com.capgemini.spring.model.Address;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestOrganization
{
    public static void main(String args[]) 
	{
        	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
			Organization organizer=(Organization)context.getBean("org");
       		System.out.println(organizer.toString());
    
    }

}