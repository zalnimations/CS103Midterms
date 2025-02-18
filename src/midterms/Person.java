package midterms;

public class Person {
	String name;
	int age;
	String address;
	
	Person(String n, int a, String ad) {
		this.name = n;
		this.age = a;
		this.address = ad;
	}
	
	public void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}

}