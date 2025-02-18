package midterms;

public class Dog {
	String name;
	String breed;
	
	Dog(String n, String b) {
		this.name = n;
		this.breed = b;
	}
	
	public void setAttributes(String n, String b) {
		this.name = n;
		this.breed = b;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
	}
}