package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.glassfish.jersey.servlet.ServletContainer;

@Path("/hello")
public class HelloResource {
	
	@GET
	@Produces("text/plain")
	public String sayHello() 
	{ 
	
		return "Hello World!Welcome";
	}

}
