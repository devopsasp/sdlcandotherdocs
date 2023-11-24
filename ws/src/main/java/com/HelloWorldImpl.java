package com;

import javax.jws.WebService;

@WebService(endpointInterface="com.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World from Java Web Service";
	}


}
