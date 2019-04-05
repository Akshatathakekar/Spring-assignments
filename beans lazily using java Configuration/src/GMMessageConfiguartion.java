package com.capgemini.spring.annotation;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class GMMessageConfiguartion
{
	@Lazy
	@Bean
	public MessageProvider provider()
	{
		return new GMMessageProvider();
	}
	
	 @Lazy
	 @Bean        
	public MessageRender renderer()
	{             
   		MessageRender renderer = new MessageRender();        
       		renderer.setMessageProvider(provider());             
   		return renderer;       
	 } 

}