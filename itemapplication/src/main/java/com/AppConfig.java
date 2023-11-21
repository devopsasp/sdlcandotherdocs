package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	
	@Bean("coffeebean")

	public Item getItem()
	{ 
		return new Item("Coffee",20,5);
	}
	
	@Bean("espressobean")
	@Primary
	public Item getItem1()
	{ 
		 return new Item("Espresso",10,3);
		
	}
	
}



