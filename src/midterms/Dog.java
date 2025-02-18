package midterms;

class dogObj {
	private String name;
	private String breed;
	
	dogObj(String n, String b) {
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

public class Dog {

	public static void main(String[] args) {
		dogObj d1 = new dogObj("Bruce", "Shih Tzu");
		dogObj d2 = new dogObj("Chica", "Golden Retriever");
		
		d1.setAttributes("Snow", "American Eskimo");
		d2.setAttributes("Cerberus", "Molossus");
		
		d1.printInfo();
		d2.printInfo();
	}

}
