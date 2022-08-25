package overridding;

public class ProjectStudents {
	public static void getstudentinfo(int id) {
		System.out.println("id = "+ id );		
	}
	public static void getstudentinfo(int id, String name) {
		System.out.println("name & id = " + name + " & " +id );		
	}
	public static void getstudentinfo(String pn ,String emailId) {
		System.out.println("Emailid and phonenumber = "+ emailId + "&" +pn );		
	}
	static int a =10;
	public static void main(String[] args) {
		getstudentinfo(10);
		getstudentinfo(10 ,"pannikutty");
		getstudentinfo("10","karthi@dxc.com");
		System.out.println(a);
	}
	
}

