
package com.capgemini.spring.test;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String args[]) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		MessageRender renderer=context.getBean(MessageRender.class);
		renderer.render();
		MessageRender renderer1=context.getBean(MessageRender.class);
		System.out.println(renderer.hashCode());
		System.out.println(renderer1.hashCode());

		int code1=renderer.hashCode();
		int code2=renderer1.hashCode();

		if(code1==code2)
		{
			System.out.println("Singleton class");
		}
		else
		{
			
			System.out.println("Not a Singleton class");

		}




	}

}

