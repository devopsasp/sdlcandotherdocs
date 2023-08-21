package aopdemo.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class EmailMessenger {
	
	
	public String sendMail(String message ,User user) throws Exception
	{
		if(message.length()<10)
		{
			throw new Exception("message has to be of size 10");
		}
		System.out.println("mail sent to ...");
		return "message sender peterone23four@gmail.com";
		
	}

}
