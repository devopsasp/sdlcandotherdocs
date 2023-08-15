package com.mystream;
import java.util.*;
import java.util.stream.*;
public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*List<Integer> numlist=Arrays.asList(12,11,19,55,23,13,22,10);
		
		Stream<Integer> intstream=numlist.stream();

		  System.out.println(intstream.reduce(0,(e1,e2)->e1+e2)/numlist.size());
		
		
		*/
		
		
		List<Device> deviceList=new ArrayList<>();
		deviceList.add(new Device("BSC","PETER",3));
		deviceList.add(new Device("Modem","Edgar",5));
		deviceList.add(new Device("Terminal","Mathew",4));
		deviceList.add(new Device("TelePrinter","Simond",7));
		deviceList.add(new Device("Connector","Samuel",6));
	
		
	//deviceList.stream().sorted((e1,e2)->e1.getTechnicianName().compareTo(e2.getTechnicianName())).forEach(System.out::println);
		
//int i=deviceList.stream().map((e)->e.getNo_of_days_assigned()).reduce(0,(a,b)->a+b);
System.out.println(Collectors.toList());


//System.out.println(i);
		;
		//System.out.println(devicestream.reduce((e1,e2)->e1.getNo_of_days_assigned()+e2.getNo_of_days_assigned()));
		
	/*Device d	=devicestream.min((d1,d2)->{
			if(d1.getNo_of_days_assigned()==d2.getNo_of_days_assigned())
			{
				return 0;
			}
			else if(d1.getNo_of_days_assigned() > d2.getNo_of_days_assigned())
			{ 
				 return 1;
			}
			else
			{ 
				return -1;
			}
			
		}).get();
		
		System.out.println(d);*/
		
		
		
		
		
		
		
		
		
		
}

}
