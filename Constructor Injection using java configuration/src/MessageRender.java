package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
public class MessageRender
{

	private MessageProvider provider;
	
	public MessageRender(MessageProvider provider)
	{
		this.provider=provider;
	}

	public void render()
	{
		System.out.println(provider.getMessage());
	}

}