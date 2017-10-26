package comcarpark;

import java.util.Scanner;

public abstract class User {
	private String name;
	private String surname;
	private String phoneNumber;
	private String emailAddress;
	private String address;
	
	public User(String name,  String surname, String phoneNumber, String emailAddress,String address) {
		super();
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getSurename() {
		return surname;
	}

	public void setSurname(String surename) {
		this.surname = surename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	 public static String askName () {
		System.out.println("Please enter your Name!");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		
		return name;
	}
	 public static String askSurname () {
			System.out.println("Please enter your Surname!");
			Scanner s=new Scanner(System.in);
			String surname=s.nextLine();
			
			return surname;
		}
	 public static String askNumber () {
			System.out.println("Please enter your Number!");
			Scanner s=new Scanner(System.in);
			String number=s.nextLine();
			return number;
		}
	 public static String askEmail () {
			System.out.println("Please enter your Email!");
			Scanner s=new Scanner(System.in);
			String email=s.nextLine();
			return email;
		}
	 public static String askRegistrationNumber () {
			System.out.println("Please enter your RegistrationNumber!");
			Scanner s=new Scanner(System.in);
			String registrationNumber=s.nextLine();
			return registrationNumber;
		}
	 public static String askMake () {
			System.out.println("Please enter your car Make!");
			Scanner s=new Scanner(System.in);
			String make=s.nextLine();
			return make;
		}
	 public static String askEmailvehicleType () {
			System.out.println("Please enter your vehicleType!");
			Scanner s=new Scanner(System.in);
			String vehicleType=s.nextLine();
			return vehicleType;
		}
	 
	 public static String askAddress () {
			System.out.println("Please enter your address!");
			Scanner s=new Scanner(System.in);
			String address=s.nextLine();
			return address;
		}
	 

	@Override
	public String toString() {
		
		return "Account created for "+this.name+" "+this.surname+"number"+this.phoneNumber+"email"+this.emailAddress+" "+this.address;
	}
	

}
