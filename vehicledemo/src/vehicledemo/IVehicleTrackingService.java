package vehicledemo;
import java.util.*;
public interface IVehicleTrackingService {
	 public void registerVehicle(int vehicleNumber);
	    public Vehicle getVehicleInfo(int vehicleNumber);
	    public boolean polledVehicleInfo(int vehicleNumber, long distanceTraveledInKm, long epochTime);
	    public List<Long> fineHistory(int vehicleNumber, int K); // returns last K timestamps when fine was imposed
}
