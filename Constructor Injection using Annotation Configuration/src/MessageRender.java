package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MessageRender
{

	private MessageProvider provider;
	
	@Autowired
	public MessageRender(MessageProvider provider)
	{
		this.provider=provider;
	}

	public void render()
	{
		System.out.println(provider.getMessage());
	}

}