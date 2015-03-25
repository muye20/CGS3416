class Shape {
	// private variables
	// can only be accessed within the class
	// the child class cannot access/modified these variables
	private int curID;
	private static int id = 1; // class variable
	
	public Shape() {
		curID = id;
		id = id + 1;
	}
	
	public static int getStaticID() {
		return id;
	}
	
	public int getCurrentID() {
		return curID;
	}

	public void Show() {
		System.out.println("A Shape is Showed");
	}
} // end class Shape

class Circle extends Shape {

	public Circle() {

	}

	// overrides parent's Show method
	public void Show() {
		System.out.println("A Circle is Showed");
	}
} // end class Circle

class Square extends Shape {

	public Square() {

	}

	public void Show() {
		System.out.println("A Squre is Showed");
	}
} // end class Square

class Triangle extends Shape {

	public Triangle() {

	}

	public void Show() {
		System.out.println("A Triangle is Showed");
	}
} // end class Triangle

public class ShapeTester {
	
	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		Shape s2 = new Circle();
		Shape s3 = new Square();
		Shape s4 = new Triangle();

		s1.Show(); // runs the Show() method in the Shape class
		s2.Show(); // runs the Show() method in the Circle class
		s3.Show(); // runs the Show() method in the Square class
		s4.Show(); // runs the Show() method in the Triangle class
		System.out.println();
		
		func(s1); // passing in a Shape object
		func(s2); // passing in a Circle object
		func(s3); // passing in a Square object
		func(s4); // passing in a Triangle object
		System.out.println();
		
		Shape [] listShape = new Shape [4]; 
		listShape[0] = new Shape();
		listShape[1] = new Circle();
		listShape[2] = new Square();
		listShape[3] = new Triangle();
		
		for(int i = 0; i < 4; i++)
			listShape[i].Show();

		for(int i = 0; i < 4; i++)
			func(listShape[i]);	
		System.out.println();
		
		// Casting
		Circle c1 = (Circle) s2;
		c1.Show();
		func(c1);
		System.out.println();
		
		// The instanceof operator
		Triangle t1 = null;
		
		for(int i = 0; i < 4; i++) {
			if(listShape[i] instanceof Triangle)
				t1 = (Triangle) listShape[i];
		}
		
		t1.Show();
		func(t1);		
	}
	
	// a java method
	public static void func(Shape s) {
		System.out.print("ID is " + s.getCurrentID() + ". ");
		s.Show();
	}
}
