package com.capgemini.spring.provider;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Lazy
@Component("gm")
public class GMMessageProvider implements MessageProvider
{
	public String getMessage()
	{
		return "Good Morning";
	}

}