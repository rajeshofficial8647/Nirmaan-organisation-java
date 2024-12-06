package day10;

import day9.main;

public class Nirmaanorg {
	public static void main(String[]args) {
		Employee emp =new Employee("Rajesh",20,9790832785l,"Java"); 
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpAge());
		System.out.println(emp.getEmpPhoneNo());
		System.out.println(emp.getEmpDepartment());
		
		System.out.println(emp);
		
		 Employee emp1=new Employee();
		 emp1.setEmpName("Rajesh");
		 emp1.setEmpAge(20);
		 emp1.setEmpPhoneNo(9790832785l);
		 emp1.setEmpDepartment("Java");
		 
		    System.out.println(emp.getEmpName());
			System.out.println(emp.getEmpAge());
			System.out.println(emp.getEmpPhoneNo());
			System.out.println(emp.getEmpDepartment());
		 
}
}
