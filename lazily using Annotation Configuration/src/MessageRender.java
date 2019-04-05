package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

@Lazy
@Component
public class MessageRender
{

	private MessageProvider provider;
	
	@Autowired
	@Qualifier("gm")
	public void setMessageProvider(MessageProvider provider)
	{
		this.provider=provider;
	}

	public void render()
	{
		System.out.println(provider.getMessage());
	}

}