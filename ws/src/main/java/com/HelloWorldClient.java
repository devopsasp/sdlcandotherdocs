package com;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
public class HelloWorldClient {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
URL  url=new URL("http://localhost:9098/ws/hello?wsdl");
QName qname=new QName("http://com/","HelloWorldImplService");
Service service=Service.create(url,qname);
HelloWorld helloWorld=service.getPort(HelloWorld.class);
System.out.println(helloWorld.getHelloWorld());
	}

}
