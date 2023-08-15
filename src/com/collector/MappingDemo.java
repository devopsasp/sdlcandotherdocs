package com.collector;
import java.util.stream.*;
import java.util.*;
public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  List<String> mydevicelist=Arrays.asList("PC","MainFrame","Laptop","Terminal","TelePrinter");
		  
		  List<String> mylist=mydevicelist.stream().collect(Collectors.mapping((e)->e.toString().toUpperCase(), Collectors.toList()));
		  
		*/
		/*ArrayList<CallQuality> callQualityList=new ArrayList<>();
		
		  callQualityList.add(new CallQuality(1,2,4,"9988322342"));
		  callQualityList.add(new CallQuality(2,4,3,"8834329934"));
		  callQualityList.add(new CallQuality(3,1,5,"7734344343"));
		  callQualityList.add(new CallQuality(4,2,4,"9934399343"));
    //List<String> mycall_list=callQualityList.stream().collect(Collectors.mapping((CallQuality call)->call.getCallDuration()+"<->"+call.getDropRate(),Collectors.toList()));
	//Long count=	mycall_list.stream().collect(Collectors.counting());
	//System.out.println(count);
	
	CallQuality quality=	  callQualityList.stream().collect(Collectors.maxBy((e1,e2)->{
			  
			  if(e1.getDropRate()==e2.getDropRate())
			  {
				  return 0;
			  }
			  else if(e1.getDropRate()>e2.getDropRate())
			  {
				   return 1;
			  }
			  else 
			  {
				  return -1;
			  }
		  })).get();
	System.out.println(quality);*/
	}

}
