
package day14;
 import java.util.Scanner;
 
public class SingleEmployeeManagement {
	public static void main(String[]args) {
		Employee E=new Employee();
		Employee E1=null;
		Scanner scan=new Scanner(System.in);
		boolean isTrue=true;
		int choice;
		
		while (isTrue) {
			System.out.println("Employee management menu: ");
			System.out.println("1.Add  the employer. ");
			System.out.println("2.update the employer.");
			System.out.println("3.Display then employer details.");
			System.out.println(" 0 for exit");
			 System.out.println("Enter your choice");
			 choice=scan.nextInt();
			 
			 scan.nextLine();
			 switch(choice) {
			 case 1:
			 {
				System.out.println("Enter the id: ");
				 int id=scan.nextInt();
				  scan.nextLine();
				  
				System.out.println("Enter the name: ");
					 String name=scan.nextLine();
					  scan.nextLine();
					    
				System.out.println("Enter the phoneNo: ");
						 long phoneNo=scan.nextLong();
						  scan.nextLine();
						  
				System.out.println("Enter the department: ");
							 String department=scan.nextLine();
							  scan.nextLine();
							  
					 E.setId(id);;
					 E.setName(name);
					 E.setPhoneNo(phoneNo);
					 E.setDepartment(department);
							   
				 System.out.println("Details updated");
				  break;
			 }
			 
			 case 2: 
			 {
				 
				 System.out.println("Enter the id: ");
				 int id=scan.nextInt();
				  scan.nextLine();
				  
				 System.out.println("Enter the name: ");
					 String name=scan.nextLine();
					  scan.nextLine();
					    
				 System.out.println("Enter the phoneNo: ");
						 long phoneNo=scan.nextLong();
						  scan.nextLine();
						  
				System.out.println("Enter the department: ");
							 String department=scan.nextLine();
							  scan.nextLine(); 
							   E1=new Employee(id,name,phoneNo,department);
							  
							  System.out.println("Details updated");
							  break;
			 }
							  case 3:
							  
								  System.out.println(E);
								  System.out.println(E1);
								  break;
							  
								  case 0:{
									  isTrue=false;
									  System.out.println("program exit. ");
								  }
									   default:
									   {
										   System.out.println("Enter the correct chioce");
										   break;								  
							  }
							  
			 }
		}
	}
}
				  
				 
		
			
	
	
		

	


