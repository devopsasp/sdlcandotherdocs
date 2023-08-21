package aopdemo.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class Messenger {
	public void printMessage(String message,User user)
	{
		 System.out.println("Hello User");
	}

}
