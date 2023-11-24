package com;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.*;
@ApplicationPath("/api/*")
public class App extends Application
{
	public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();
        classes.add(HelloResource.class);
        
        return classes;
    }
}
    
