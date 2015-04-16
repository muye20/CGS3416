import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class BasicDraw {
	public static void main(String[] args) {
		new BasicDraw();
	}

	BasicDraw() {
		JFrame frame = new JFrame();

		frame.add(new MyComponent());
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}

class MyComponent extends JComponent {

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		float strokeThickness = 2.0f;

		float miterLimit = 10f;
		float[] dashPattern = { 10f };
		float dashPhase = 5f;
		BasicStroke stroke = new BasicStroke(strokeThickness,
				BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, miterLimit,
				dashPattern, dashPhase);
		g2d.setStroke(stroke);

		g2d.draw(new Rectangle(20, 20, 200, 200));

	}
}
