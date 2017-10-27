package comcarpark;

import java.util.ArrayList;

public class Owner extends User{
	
	private ArrayList <Vehicle> vehicles;
	
	public Owner(String name,  String surname, String phoneNumber, String emailAddress,String address, String password,String retypePassword) {
		super(name,surname, phoneNumber, emailAddress,address, password, retypePassword);
		this.vehicles=new ArrayList <Vehicle> ();// TODO Auto-generated constructor stub
	}
	
	/*public Owner(String name,  String surname, String phoneNumber, String emailAddress,String address) {
		super(name,surname, phoneNumber, emailAddress,address);
		
	}*/
	
		
		

	
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	
	
}
