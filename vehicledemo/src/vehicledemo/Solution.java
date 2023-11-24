package vehicledemo;
import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      PrintWriter out = new PrintWriter(new FileWriter("datafile.txt"));
	     
	      String arr[];
	      int numberOfQueries, M;

	      arr = br.readLine().trim().split(" ");
	      numberOfQueries = Integer.parseInt(arr[0]);
	      M = Integer.parseInt(arr[1]);

	      VehicleTrackingService vehicleTrackingService = new VehicleTrackingService(M);
	      for(int queryNumber = 1; queryNumber <= numberOfQueries; queryNumber++) {
	          arr = br.readLine().trim().split(" ");
	          System.out.println(arr[0]);
	          switch(arr[0]) {
	              case "registerVehicle":
	              int vehicleNum = Integer.parseInt(arr[1]);
	              vehicleTrackingService.registerVehicle(vehicleNum);
	              break;

	              case "getVehicleInfo":
	              vehicleNum = Integer.parseInt(arr[1]);
	              Vehicle vehicle = vehicleTrackingService.getVehicleInfo(vehicleNum);
	              out.println(vehicle.fineSummary.lastPolledInfo + " " + vehicle.fineSummary.numberOfTimesFineImposed);
	              break;

	              case "polledVehicleInfo":
	              boolean flag = vehicleTrackingService.polledVehicleInfo(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), 
	              Long.parseLong(arr[3]));
	              out.println(flag);
	              break; 

	              case "fineHistory":
	              vehicleNum = Integer.parseInt(arr[1]);
	              int K = Integer.parseInt(arr[2]);
	              List<Long> fineTimeStamps = vehicleTrackingService.fineHistory(vehicleNum, K);
	              for(long x : fineTimeStamps) {
	                  out.print(x + " ");
	              }
	              out.println();
	              break;
	          }
	      }
	      
	      out.flush();
	      out.close();
	  }
	}
	  


