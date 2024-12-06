package day10;

public class Employee {

	private String empName;
	private int empAge;
	private long empPhoneNo;
    private String empDepartment;
    
    public Employee() {
	
}
    
public Employee(String empName,int empAge,long empPhoneNo,String empDepartment) {
 this.empName=empName;
 this.empAge=empAge;
 this.empPhoneNo=empPhoneNo;
 this.empDepartment=empDepartment;
}
public void setEmpName(String empName) {
	this.empName=empName;	
}
public void setEmpAge(int empAge) {
	this.empAge=empAge;
}
public void setEmpPhoneNo(long empPhoneNo) {
	this.empPhoneNo=empPhoneNo;
}
public void setEmpDepartment(String empDepartment) {
	this.empDepartment=empDepartment;
}
 public  String getEmpName() {
	return empName;
 }
 public int getEmpAge() {
	 return empAge;
 }
 public long getEmpPhoneNo() {
	 return empPhoneNo;
 }
 public String getEmpDepartment() {
	 return empDepartment;
 }
	 
	 public String toString() {
		 return "your Name :"+empName+"\nYour Age :"+empAge+"\nYour PhoneNo :"+empPhoneNo+"\nYour Department :"+empDepartment;
	 }
 }
		 
	

