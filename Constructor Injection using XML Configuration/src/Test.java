
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
		MessageRender renderer=(MessageRender)context.getBean("render");
		renderer.render();
	}

}

