package day2;
import java.util.Scanner;

public class SimpleCalculator {
 public static void main(String[]args) {
	 Scanner scan = new Scanner(System.in);
	 int firstNum=scan.nextInt();
	 int secondNum=scan.nextInt();
	 
	 System.out.println("Enter your choice");
	 System.out.println("o for Add");
	 System.out.println("1 for Sub");
	 System.out.println("2 for Mul");
	 System.out.println("3 for Div");
	 System.out.println("4 for mod");
	 
	 int key=scan.nextInt();
//	 if (key==0){
//		 System.out.println(" Addition :"+(firstNum+secondNum));
//	 }
//	 
//	 else if(key==1)
//		 System.out.println("Subtraction:"+(firstNum-secondNum));
//	 
//	 else if(key==2)
//		 System.out.println("Multiplication:"+(firstNum*secondNum));
//	 
//	 else if(key==3)
//		 System.out.println("Division:"+(firstNum/secondNum));
//	 
//	 else if(key==4)
//		 System.out.println("Modulus:"+(firstNum%secondNum));
//		 
//	 else
//		 System.out.println("Enter your correct choice");
// }

 switch(key) {
 case 0:
	 System.out.println(" Addition :"+(firstNum+secondNum));
	 break;

 case 1:
 System.out.println("Subtraction:"+(firstNum-secondNum));
break;
 
 case 2:
	 System.out.println("Multiplication:"+(firstNum*secondNum));
break;

 case 3:
	 System.out.println("Division:"+(firstNum/secondNum));
	  break;
	  
 case 4:
	 System.out.println("Modulus:"+(firstNum%secondNum));
break;

default:
 System.out.println("Enter your correct key");

	
 }
 }}

