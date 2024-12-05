package day9;

public class main {
	public static void main(String[]args) {
		car car1=new car();
		car1.displayCarDetails();
		
		car car2=new car("BMW");
		car2.displayCarDetails();
		
		car car3=new car("BENZ",1824);
		car3.displayCarDetails();
	}

}
