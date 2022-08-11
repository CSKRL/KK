package Week.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator total = new Calculator();
		int sum = total.add(1,2,3);
		System.out.println("SUM ="+ sum);
		int subtract = total.sub(7, 1);
		System.out.println("SUB =" + subtract);
		float division = total.div(8, 2);
		System.out.println("DIV="+ division);
		double divide = total.mul(2, 2);
		System.out.println("Multiplication ="+ divide);
	}

}

