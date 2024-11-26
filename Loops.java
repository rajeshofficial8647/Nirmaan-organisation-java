package day3;
import java.util.Scanner;
public class Loops {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER YOUR MARK");
 int mark=scan.nextInt();
 if(mark>=35) {
	 if(mark>=90) {
		 System.out.println("Grade A");
		 }
	 else if(mark>=70) {
	
		 System.out.println("Grade B");
		 }
	 else{
		 System.out.println("Fail");
	 }
	 }
 }
}
