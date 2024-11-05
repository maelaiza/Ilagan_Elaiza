package Ilagan_L7Activity2;

//import Ilagan_L7Activity1.Passenger;

public class Passenger2 {
	public String name;
	public char gender;
	public String nationality;
	public String dateofBirth;
	public String [] passport;
	public long PWD;

	public Passenger2(String name, char gender, String nationality, String dateofBirth) {
		this.name = name;
		this.gender =gender;
		this.nationality = nationality;
		this.dateofBirth = dateofBirth;
		
	}
	public Passenger2(String name, char gender, String nationality, String dateofBirth, long PWD) {
		this(name, gender, nationality, dateofBirth);
		this.PWD = PWD;
	}
	
	public String toString( ){
		return "Name: " + name +
				"\nGender: " + gender +
				"\nNationality: " + nationality +
				"\nDate of Birth: " + dateofBirth +
				"\nPWDNo: " + PWD;
	}
	public static void main(String[] args) {
		Passenger2 passenger2 = new Passenger2 ("Elaiza Ilagan",'F',"Filipino","October 27, 2000",0123L );
		Passenger2 passenger3 = new Passenger2 ("Elaiza Ilagan",'F',"Filipino","October 27, 2000");
		
		System.out.println(passenger2.toString());
		System.out.println(passenger3.toString());
		
		
//				"Name: " + passenger.name +
//				"\nGender: " + passenger.gender +
//				"\nNationality: " + passenger.nationality +
//				"\nDate of Birth: " + passenger.dateofBirth +
//				"\nPWDNo: " + passenger.PWD);
		
		
		
		

}
}

