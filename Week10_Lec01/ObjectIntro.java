import java.util.Random;

// class Rectangle is blueprint for Rectangle object
class Rectangle {
	// These are the fields used to store the width and height of your Rectangle
	// object.
	private double width, height; // private => can only be used by the object
									// itself.
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
		if (w > 0)
			width = w;
	}

	// This is a setter method, it is used to change the value of height
	// to whatever h is.
	public void setHeight(double h) {
		if (h > 0)
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

		Random RandGen = new Random();
		// use the class name instead of the primitive type name
		Rectangle[] myListOne = new Rectangle[NUM_ITEMS];
		Rectangle[] myListTwo = new Rectangle[NUM_ITEMS];

		int randH, randW;
		for (int i = 0; i < NUM_ITEMS; i++) {
			// Create the individual objects with new
			// invoke default constructor
			myListOne[i] = new Rectangle();

			randH = RandGen.nextInt(60) + 1;
			randW = RandGen.nextInt(60) + 1;
			// invoke constructor with parameter
			myListTwo[i] = new Rectangle(randH, randW);
		}

		// comparing the first and second item
		// in array myListOne
		if (CompareRectangle(myListOne[0], myListOne[1]))
			System.out.println("The Same");
		else
			System.out.println("Not The Same");

		// comparing the first and second item
		// in array myListTwo
		if (CompareRectangle(myListTwo[0], myListTwo[1]))
			System.out.println("The Same");
		else
			System.out.println("Not The Same");

		PrintRectangleList(myListTwo);
		PrintRectangleList(myListOne);

		// iterate through array myListOne
		// and enlarge each individual Rectangle object
		// by factor of 2
		for (int i = 0; i < NUM_ITEMS; i++)
			ResizeRectangle(myListOne[i], 2);
		PrintRectangleList(myListOne);
	}

	// function takes Object as argument
	// compare two rectangle
	// return true if their size are the same
	// otherwise return false
	public static boolean CompareRectangle(Rectangle rect1, Rectangle rect2) {
		if (rect1.getWidth() == rect2.getWidth()
				&& rect1.getHeight() == rect2.getHeight())
			return true;
		else
			return false;
	}

	// pass by reference. Changes to the object
	// (from inside the method) will affect the original
	// re-scale incoming Rectangle object by factor
	public static void ResizeRectangle(Rectangle rectIN, final int FACTOR) {
		double w, h;
		w = rectIN.getWidth() * FACTOR;
		h = rectIN.getHeight() * FACTOR;

		rectIN.setWidth(w); // re-scale width
		rectIN.setHeight(h); // re-scale height
	}

	// function takes array of Object as argument
	public static void PrintRectangleList(Rectangle[] rectList) {
		System.out.printf("%-5s", "i");
		System.out.printf("%-10s", "Width");
		System.out.printf("%-10s\n", "Height");

		for (int i = 0; i < rectList.length; i++) {
			System.out.printf("%-5d", i);
			System.out.printf("%-10d", (int) rectList[i].getWidth());
			System.out.printf("%-10d\n", (int) rectList[i].getHeight());
		}
	}
}