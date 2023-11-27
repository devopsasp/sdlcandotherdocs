package vehicledemo;

import java.util.*;
public class VehicleTrackingService  implements IVehicleTrackingService{

List<Vehicle> vehicleList;
List<Vehicle> fineList;
long M;
	public VehicleTrackingService(long M) {
      
      this.M=M;
      vehicleList=new ArrayList<>();
      fineList=new ArrayList<>();
    } 

@Override
public void registerVehicle(int vehicleNumber) {
	// TODO Auto-generated method stub
	
	 Vehicle vehicle=new Vehicle();
	 vehicle.vehicleNumber=vehicleNumber;
	 vehicle.fineSummary=new FineSummary();
	 vehicleList.add(vehicle);
	
			
}

@Override
public Vehicle getVehicleInfo(int vehicleNumber) {
	// TODO Auto-generated method stub
	Vehicle v=null;
	for(Vehicle vehicle:vehicleList)
	{
		System.out.println("number "+vehicle.vehicleNumber);
				
		if(vehicle.vehicleNumber==vehicleNumber)
		{
			System.out.println(vehicle.vehicleNumber);
			v=vehicle;
			
		}
	}
	return v;
}

@Override
public boolean polledVehicleInfo(int vehicleNumber, long distanceTraveledInKm, long epochTime) {
	// TODO Auto-generated method stub
	

	long check=0;
	for(Vehicle v : vehicleList)
	{
		
		if(v.vehicleNumber==vehicleNumber)
		{ 
		
			if(epochTime==v.fineSummary.lastPolledInfo)
			{
			
				return false;
			}
			check=distanceTraveledInKm*60*60/(epochTime-v.fineSummary.lastPolledInfo);
			System.out.println(distanceTraveledInKm);
			System.out.println(v.fineSummary.lastPolledInfo);
			System.out.println(check);
		
		}
		v.fineSummary.lastPolledInfo=epochTime;
	}
	 
  if(check>M)
  {
	  Vehicle v=new Vehicle();
	  v.vehicleNumber=vehicleNumber;
	  v.fineSummary=new FineSummary();
	  v.fineSummary.lastPolledInfo=epochTime;
	  fineList.add(v);
	  return true;
  }
  else
  {
	  return false;
  }
}

@Override
public List<Long> fineHistory(int vehicleNumber, int K) {
	// TODO Auto-generated method stub
	ArrayList<Long> vhcl=new ArrayList<>();
	System.out.println(fineList);
	if(fineList.size()!=0)
	{
	for(int i=0;i<K;i++)
	{
		try {
			if(fineList.get(i).vehicleNumber==vehicleNumber)
			{
			   	  vhcl.add(fineList.get(i).fineSummary.lastPolledInfo);
			}	
		}
		catch(Exception e)
		{
			
		}
		
		
	}
	}
	System.out.println(fineList);
	
	vhcl.sort((a,b)->a>b?-1:1);
	System.out.println(vhcl);
	return vhcl;
}
 

}
