package day13;

 class Animal{
	void makeSound() {
		System.out.println("This animal makes a Sound");
	}
}
class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("The dog barks");

	}
}
class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("The Cat meows");
}
}
public class AnimalSound{
public static void main(String[]args) {
	Dog D =new Dog();
	D.makeSound();
	Cat C = new Cat();
	C.makeSound();
	
}
	
}
