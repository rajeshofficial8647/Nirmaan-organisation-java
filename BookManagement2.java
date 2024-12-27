package day23;

import java.util.ArrayList;
import java.util.Scanner;

import day16.main;
import day22.Book;

public class BookManagement2 {
	public static void main(String[] args) {
		Booktemplate book = new Booktemplate();
		Scanner scan = new Scanner(System.in);
		ArrayList<Booktemplate> al = new ArrayList<Booktemplate>();
		
		boolean isTrue = true;
		
		int choice;
		
		while(isTrue) {
			System.out.println("1 for add");
			System.out.println("2 for update");
			System.out.println("3 for remove");
			System.out.println("4 for get");
			System.out.println("0 for exit");
			
			System.out.println("\nEnter your choice");
			choice = scan.nextInt();
			
			scan.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter the Book id");
				int id=scan.nextInt();
				 scan.nextLine();
				System.out.println("Enter the bookName");
				String bookName = scan.nextLine();
				
				System.out.println("Enter the author");
				String author = scan.nextLine();
				
				System.out.println("Enter the price");
				double price = scan.nextDouble();
				
				System.out.println("Enter the noofCopies");
				int copies = scan.nextInt();
				al.add(book = new Booktemplate(id, bookName, author, price, copies));
			
			}
			else if(choice == 2) {
				System.out.println("Enter the bookid");
				int select =scan.nextInt();
				scan.nextLine();
				boolean isThere=false;
				for(Booktemplate book1:al) {
					if(select==book1.getId()) {
						isThere=true;
						System.out.println("Enter the bookName");
						String value = scan.nextLine();
						book1.setBookName(value);
						}
					
			}
			if(!isThere) {
			System.out.println("Book not found!!! ");
			}	
			}
			
			else if(choice == 3) {
				System.out.println("Enter the id");
				int id  = scan.nextInt();
				boolean isThere = false;
				
				for(Booktemplate book2 : al) {
					if(id==book2.getId()) {
						isThere=true;
						al.remove(book2);
						System.out.println("id is remove");
						break;
						
						
					}	
				}
			if(!isThere) {
				System.out.println("not there");
			}
			}
				
			else if(choice == 4) {
				System.out.println(al);
			}
			
			else if(choice == 0) {
				isTrue = false;
				System.out.println("program exit");
			}
			
			
			
		} 
		scan.close();
	}


	
}

