package com.collector;
import java.util.*;
import java.util.stream.*;

public class ListCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List<Integer> numlist=Arrays.asList(12,23,11,19,55,23,17,22,15);
  List<Integer> newlist=numlist.stream().filter((e)->e>20).map((e)->e*e).collect(Collectors.toList());
  System.out.println(newlist);*/
		
	  ArrayList<CallQuality> callQualityList =new ArrayList();
	  callQualityList.add(new CallQuality(1,2,4,"9988322342","Mumbai"));
	  callQualityList.add(new CallQuality(2,4,3,"8834329934","Delhi"));
	  callQualityList.add(new CallQuality(3,1,5,"7734344343","Kolkatta"));
	  callQualityList.add(new CallQuality(4,2,4,"9934399343","Mumbai"));
	  callQualityList.add(new CallQuality(5,3,3,"9987755433","Delhi"));
	  callQualityList.add(new CallQuality(6,2,4,"9983355433","Chennai"));
	  callQualityList.add(new CallQuality(7,1,5,"33437755433","Mumbai"));
	
	
Map myaverage=	  callQualityList.stream().collect(Collectors.groupingBy(CallQuality::getLocation,Collectors.summarizingInt(CallQuality::getCallDuration)));
	  System.out.println(myaverage);
	  
	  
	 /* Map<String,Map<Float,List<CallQuality>>> mylistmap=callQualityList.stream().collect(Collectors.groupingBy(CallQuality::getLocation,Collectors.groupingBy(CallQuality::getDropRate)));
	  
	  
	  for(String s:mylistmap.keySet())
	  {
		  
		  System.out.println(s);
		  Map<Float ,List<CallQuality>> calllist=mylistmap.get(s);
		 System.out.println(calllist);
	  }
	  */
	  
	  
  //List<String> call_list=callQualityList.stream().filter((e)->e.getCallDuration()>=2).map((e)->e.getMobileNo()+","+e.getDropRate()).collect(Collectors.toList());

  
  //Set<String> call_list=	  callQualityList.stream().filter((e)->e.getCallDuration()>=2).map((e)->e.getMobileNo()+","+e.getDropRate()).collect(Collectors.toSet());
	
	//System.out.println(call_list);
	}

}
