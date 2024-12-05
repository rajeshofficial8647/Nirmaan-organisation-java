package day9;

public class car {
	String make;
	int year;
	
public car() {
	this.make="unkown";
	this.year=2000;
}

car(String make){
	this.make=make;
	this.year=2000;
}
car(String make,int year){
	this.make=make;
	this.year=year;
}
void displayCarDetails() {
 System.out.println("Car make"+make);
System.out.println("Car year"+year);
}

}
