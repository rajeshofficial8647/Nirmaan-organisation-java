package day3;
import java.util.Scanner;
public class Loops2 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the table");
		int table=scan.nextInt();
	 for (int num=1;num<=10;num++) {
System.out.println( table +"x"+num+"="+num*table);
	 }

}}
