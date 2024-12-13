package day16;
import java.util.*;

public class main {
	public static void main(String[]args) {
		Calculator calc=new Calculator();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the FirstNumber");
		int firstNum=scan.nextInt();
		System.out.println("Enter the SecondNumber");
		int secondNum=scan.nextInt();
		
		System.out.println("Addition");
		System.out.println(calc.add(firstNum,secondNum));
		System.out.println("Subtraction");
		System.out.println(calc.sub(firstNum,secondNum));
		System.out.println("Multiplication");
		System.out.println(calc.mul(firstNum,secondNum));
		System.out.println("Division");
		System.out.println(calc.div(firstNum,secondNum));
	}
	
	

}
