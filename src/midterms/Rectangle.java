package midterms;

class rectObj {
	double length;
	double width;
	
	rectObj(double l, double w) {
		this.length = l;
		this.width = w;
	}
	
	double area() {
		return this.length * this.width;
	}
	
	double perimeter() {
		return (this.length + this.width) * 2;
	}
}

public class Rectangle {

	public static void main(String[] args) {
		rectObj r1 = new rectObj(11, 8.5);
		
		System.out.println("Area: " + r1.area());
		System.out.println("Perimeter: " + r1.perimeter());

	}

}
