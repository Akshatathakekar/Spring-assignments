
package com.capgemini.spring.test;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;
import com.capgemini.spring.annotation.*;
import org.springframework.context.ApplicationContext;
 import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test
{
	public static void main(String args[]) 
	{
		ApplicationContext context= new AnnotationConfigApplicationContext(GMMessageConfiguartion.class);
		MessageRender renderer=(MessageRender)context.getBean(MessageRender.class);
		renderer.render();
	}

}

