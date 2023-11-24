package com;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Endpoint.publish("http://localhost:9098/ws/hello", new HelloWorldImpl());
	}

}
