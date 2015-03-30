import java.awt.*;
import javax.swing.*;

public class TestFrame1 {
	public static void main(String[] args) {
		// construct a JFrame object
		JFrame frame = new JFrame("Test Frame 1");
		
		// set it to 600 pixels wide by 300 high
		frame.setSize(600, 300);
		
		// ask it to become visible on the screen
		frame.setVisible(true);
		
		// say what the close button does
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}