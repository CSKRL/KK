package Week.day2;

public class Car {
	public void carbrand () {
		System.out.println("Bucati");
	}
	public String carcolor() {
		return "cherryRed";
	}
	public int chaseNumber() {
			return 11991199;
		
	}
	public int subofnumbers(int a,int b) {
		int c= a-b;
		return c;
		
	}
	public static void main(String[] args) {
		Car ask = new Car();
		//ask.carbrand;
		ask.carbrand();
		String carcolor = ask.carcolor();
		System.out.println(carcolor);
		int chaseNumber = ask.chaseNumber();
		System.out.println(chaseNumber);
		int subofnumbers = ask.subofnumbers(10, 10);
		System.out.println(subofnumbers);
	}
	

}
