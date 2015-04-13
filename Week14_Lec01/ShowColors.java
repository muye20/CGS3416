import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

class ColorJPanel extends JPanel {
	// draw rectangles and Strings in different colors
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // call superclass's paintComponent

		this.setBackground(Color.WHITE);

		// set new drawing color using integers
		g.setColor(new Color(255, 0, 0));
		g.fillRect(15, 25, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 40);

		// set new drawing color using floats
		g.setColor(new Color(0.50f, 0.75f, 0.0f));
		g.fillRect(15, 50, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 65);

		// set new drawing color using static Color objects
		g.setColor(Color.BLUE);
		g.fillRect(15, 75, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 90);

		// display individual RGB values
		Color color = Color.MAGENTA;
		g.setColor(color);
		g.fillRect(15, 100, 100, 20);
		g.drawString("RGB values: " + color.getRed() + ", " + color.getGreen()
				+ ", " + color.getBlue(), 130, 115);
	} // end method paintComponent
} // end class ColorJPanel

public class ShowColors {
	// execute application
	public static void main(String args[]) {
		// create frame for ColorJPanel
		JFrame frame = new JFrame("Using colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ColorJPanel colorJPanel = new ColorJPanel(); // create ColorJPanel
		frame.add(colorJPanel); // add colorJPanel to frame
		frame.setSize(400, 180); // set frame size
		frame.setVisible(true); // display frame
	} // end main
}