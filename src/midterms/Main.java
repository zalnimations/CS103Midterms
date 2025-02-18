package midterms;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Person
		List<Person> people = new ArrayList<Person>();
		String[] names = {"Odysseus", "Penelope", "Paris", "Helen", "Circe"};
		int[] ages = {40, 40, 30, 30, 100};
		String[] addresses = {"Ithaca", "Sparta", "Troy", "Argos", "Aeaea"};
		
		for(int i = 0; i < 5; i++) {
			Person person = new Person(names[i], ages[i], addresses[i]);
			people.add(person);
			people.get(i).printInfo();
		}

		// Separator
		System.out.println();
		
		// Dog
		Dog d1 = new Dog("Bruce", "Shih Tzu");
		Dog d2 = new Dog("Chica", "Golden Retriever");
		
		d1.setAttributes("Snow", "American Eskimo");
		d2.setAttributes("Cerberus", "Molossus");
		
		d1.printInfo();
		d2.printInfo();

		// Separator
		System.out.println();
		
		// Rectangle
		Rectangle r1 = new Rectangle(11, 8.5);
		
		System.out.println("Area: " + r1.area());
		System.out.println("Perimeter: " + r1.perimeter());

	}

}
