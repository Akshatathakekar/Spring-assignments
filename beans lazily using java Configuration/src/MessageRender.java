package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
public class MessageRender
{

	private MessageProvider provider;
	
	public void setMessageProvider(MessageProvider provider)
	{
		this.provider=provider;
	}

	public void render()
	{
		System.out.println(provider.getMessage());
	}

}