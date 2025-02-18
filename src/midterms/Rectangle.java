package midterms;

public class Rectangle {
	double length;
	double width;
	
	Rectangle(double l, double w) {
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
