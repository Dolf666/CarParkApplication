package comcarpark;

public abstract class Vehicle {
	String registrationNumber;
	String make;
	String vehicleType;
	
	public Vehicle(String registrationNumber, String make, String vehicleType) {
		super();
		this.registrationNumber = registrationNumber;
		this.make = make;
		this.vehicleType = vehicleType;
	}
	
}
