package midterms;

import java.util.ArrayList;
import java.util.List;

class personObj {

	String name;
	int age;
	String address;
	
	personObj(String n, int a, String ad) {
		this.name = n;
		this.age = a;
		this.address = ad;
	}
	
	public void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}

}

public class Person {
	public static void main(String[] args) {
		List<personObj> people = new ArrayList<personObj>();
		String[] names = {"Odysseus", "Penelope", "Paris", "Helen", "Circe"};
		int[] ages = {40, 40, 30, 30, 100};
		String[] addresses = {"Ithaca", "Sparta", "Troy", "Argos", "Aeaea"};
		
		for(int i = 0; i < 5; i++) {
			personObj person = new personObj(names[i], ages[i], addresses[i]);
			people.add(person);
			people.get(i).printInfo();
		}
	}
}