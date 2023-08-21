package aopdemo.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class Messenger {
	public void printMessage(String username)
	{
		 System.out.println("Hello "+username);
	}

}
