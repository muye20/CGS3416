import java.awt.*;
import javax.swing.*;

public class TestFrameExpand {
	public static void main(String[] args) {
		int height = 100, width = 200;
		JFrame frame = new JFrame("Test Frame Extra");

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int extra = 0; extra < 500; extra += 1)
			frame.setSize(width + extra, height + extra);
	}
}