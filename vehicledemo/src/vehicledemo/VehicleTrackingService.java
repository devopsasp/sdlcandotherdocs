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

				
		if(vehicle.vehicleNumber==vehicleNumber)
		{
			
			v=vehicle;
			
		}
	}
	return v;
}

@Override
public boolean polledVehicleInfo(int vehicleNumber, long distanceTraveledInKm, long epochTime) {
	
	long check=0;
	for(Vehicle v : vehicleList)
	{
		
		if(v.vehicleNumber==vehicleNumber)
		{ 
		
			if(epochTime==v.fineSummary.lastPolledInfo)
			{
			
				return false;
			}
			
			check=(distanceTraveledInKm*60*60)/Math.abs((epochTime-v.fineSummary.lastPolledInfo));
			
		
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
	  for (Vehicle v1 : fineList) {
          if (v1.vehicleNumber == vehicleNumber) {
              v1.fineSummary.numberOfTimesFineImposed++;
              break;
          }
      }
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
	
	
	vhcl.sort((a,b)->a>b?-1:1);

	return vhcl;
}
 

}
