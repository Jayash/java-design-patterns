package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {
	
	private List<String> vehicleType;
	
	public Vehicle() {
		vehicleType = new ArrayList<>();
	}
	
	public Vehicle(List<String> vehicleType) {
		this.vehicleType = vehicleType;
	}

	public List<String> getVehicleType() {
		return vehicleType;
	}
	
	public void insertInVehicleList(String type) {
		vehicleType.add(type);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		List<String> clone = new ArrayList<>();
		
		vehicleType.stream().forEach(v -> clone.add(v));
		
		return new Vehicle(clone);
	}
	
}
