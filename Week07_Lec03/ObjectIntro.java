// class Rectangle is blueprint for Rectangle object
class Rectangle {
	// These are the fields used to store the width and height of your Rectangle
	// object.
	private double width, height;
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

	public void Summary() {
		System.out.println("The hight is " + getHeight());
		System.out.println("The width is " + getWidth());
		System.out.println("The perimeter is " + getPerimeter());
		System.out.println("The area is " + getArea());
	}
}

public class ObjectIntro {

	public static void main(String[] args) {
		Rectangle myRect1 = new Rectangle();
		myRect1.Summary();

		System.out.println("Rectangle Object has color " + Rectangle.getColor());
	}
}
