import java.util.Random;

// class Rectangle is blueprint for Rectangle object
class Rectangle {
	// These are the fields used to store the width and height of your Rectangle
	// object.
	private double width, height;  // private => can only be used by the object itself.
	// This is a static field used to specify the color of the Rectangle
	private static String color = "Red";

	private final double DEFAULT_WIDTH = 1.0;
	private final double DEFAULT_HEIGHT = 1.0;

	// Constructor for the class, used to set up all data when a
	// Rectangle object is created. This default constructor creates
	// a Rectangle object with a width and height of 1.0
	public Rectangle() {
		width = DEFAULT_WIDTH;
		height = DEFAULT_HEIGHT;
	}

	// This is another constructor for the Rectangle class that accepts
	// two arguments that are of the type double. This is what the you
	// will use when you know what the width and height of the Rectangle
	// object is when you create it. The constructor takes w and h and
	// sets them equal to width and height respectively.
	public Rectangle(double w, double h) {
		if (w <= 0 || h <= 0) {
			width = DEFAULT_WIDTH;
			height = DEFAULT_HEIGHT;
		} else {
			width = w;
			height = h;
		}
	}

	// This is a setter method, it is used to change the value of width
	// to whatever w is.
	public void setWidth(double w) {
		if(w > 0)
			width = w;
	}

	// This is a setter method, it is used to change the value of height
	// to whatever h is.
	public void setHeight(double h) {
		if(h > 0)
			height = h;
	}

	// This is a getter method, it is used to retrieve the value of width
	// at the current time.
	public double getWidth() {
		return width;
	}

	// This is a getter method, it is used to retrieve the value of height
	// at the current time.
	public double getHeight() {
		return height;
	}

	// Here is the getArea method, it uses the width and height
	// field that is stored in your rectangle object to
	// calculate the area.
	public double getArea() {
		return width * height;
	}

	// Here is the getPerimeter method, it uses the width and height
	// field that is stored in your rectangle object to
	// calculate the perimeter.
	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}

	// Here is a static method
	public static String getColor() {
		return color;
	}

	// public => can be accessed from inside or outside of the object.
	public void Summary() {
		System.out.println("The hight is " + getHeight());
		System.out.println("The width is " + getWidth());
		System.out.println("The perimeter is " + getPerimeter());
		System.out.println("The area is " + getArea());
	}
}

public class ObjectIntro {

	public static void main(String[] args) {
		final int NUM_ITEMS = 10;
		
		Random RandGen = new Random ();
		Rectangle myRect1 = new Rectangle();
		//myRect1.Summary();
		// use the class name instead of the primitive type name
		Rectangle [] myListOne = new Rectangle [NUM_ITEMS];
		Rectangle [] myListTwo = new Rectangle [NUM_ITEMS];

		int randH, randW;
		for(int i = 0; i < NUM_ITEMS; i++) {
			// Create the individual objects with new
			// invoke default constructor 
			myListOne[i] = new Rectangle();
			
			randH = RandGen.nextInt(60) + 1;
			randW = RandGen.nextInt(60) + 1;
			// invoke constructor with parameter 
			myListTwo[i] = new Rectangle(randH, randW);
		}
		
		// print out 
		System.out.printf("%-3s", "i");
		System.out.printf("%-15s", "ListOne Width");
		System.out.printf("%-15s", "ListOne Height");
		System.out.printf("%-15s", "ListTwo Width");
		System.out.printf("%-15s\n", "ListTwo Height");
		for(int i = 0; i < NUM_ITEMS; i++) {
			System.out.printf("%-3d", i);
			System.out.printf("%-15d", (int) myListOne[i].getWidth());
			System.out.printf("%-15d", (int) myListOne[i].getHeight());
			System.out.printf("%-15d", (int) myListTwo[i].getWidth());
			System.out.printf("%-15d\n", (int) myListTwo[i].getHeight());			
		}
	}
}