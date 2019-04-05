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
		Organization organizer=context.getBean(Organization.class);
       	System.out.println(organizer.toString());
    
    }

}