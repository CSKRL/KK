package week1.day1;

public class TwoWheeler {
	
	//Declaring Global Variables with Values
	public int noOfWheels =2;
	public short noOfMirrors = 2;
	public long chaseNumber = 1234567890123456789L;
	public boolean isPunchured = false;
	public String bikeName = "YAMAHARXZ";
	public double runningKM = 100000;
	
	public static void main(String[] args) {
		
		// Create an object using New Keyword
		TwoWheeler vandi = new TwoWheeler();
		
		//calling all the variables inside the main method and print the values
		System.out.println(vandi.bikeName);
		System.out.println(vandi.chaseNumber);
		System.out.println(vandi.runningKM);
		System.out.println(vandi.noOfWheels);
		System.out.println(vandi.noOfMirrors);
		System.out.println(vandi.isPunchured);
		
	}
}
