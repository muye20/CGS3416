import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;

class Shapes2JPanel extends JPanel {
	// draw general paths
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // call superclass's paintComponent
		Random random = new Random(); // get random number generator

		int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
		int yPoints[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };

		Graphics2D g2d = (Graphics2D) g;
		GeneralPath star = new GeneralPath(); // create GeneralPath object

		// set the initial coordinate of the General Path
		star.moveTo(xPoints[0], yPoints[0]);

		// create the star--this does not draw the star
		for (int count = 1; count < xPoints.length; count++)
			star.lineTo(xPoints[count], yPoints[count]);

		star.closePath(); // close the shape

		g2d.translate(200, 200); // translate the origin to (200, 200)

		// rotate around origin and draw stars in random colors
		for (int count = 1; count <= 20; count++) {
			g2d.rotate(Math.PI / 10.0); // rotate coordinate system

			// set random drawing color
			g2d.setColor(new Color(random.nextInt(256), random.nextInt(256),
					random.nextInt(256)));

			g2d.fill(star); // draw filled star
		} // end for
	} // end method paintComponent
} // end class Shapes2JPanel

public class Shapes2 {
	// execute application
	public static void main(String args[]) {
		// create frame for Shapes2JPanel
		JFrame frame = new JFrame("Drawing 2D Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Shapes2JPanel shapes2JPanel = new Shapes2JPanel();
		frame.add(shapes2JPanel); // add shapes2JPanel to frame
		frame.setBackground(Color.WHITE); // set frame background color
		frame.setSize(400, 400); // set frame size
		frame.setVisible(true); // display frame
	} // end main
} // end class Shapes2