package com.capgemini.spring.provider;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("hw")
public class HWMessageProvider implements MessageProvider
{
	public String getMessage()
	{
		return "Hello World";
	}

}