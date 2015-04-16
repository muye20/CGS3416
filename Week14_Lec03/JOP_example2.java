// Illustrates concatenation operation in output statements

import javax.swing.JOptionPane;

public class JOP_example2 {
	public static void main(String[] args) {
		int x, y;
		double a, b;
		String s1, s2;

		s1 = JOptionPane.showInputDialog("Please enter an integer:");
		s2 = JOptionPane.showInputDialog("Please enter another integer:");

		x = Integer.parseInt(s1);
		y = Integer.parseInt(s2);

		s1 = JOptionPane.showInputDialog("Please enter an double:");
		s2 = JOptionPane.showInputDialog("Please enter another double:");

		a = Double.parseDouble(s1);
		b = Double.parseDouble(s2);

		String output = "The sum of your two integers:\n" + x + " + " + y
				+ " = " + (x + y) + "\n\n" + "The sum of your two doubles:\n"
				+ a + " + " + b + " = " + (a + b) + "\n";

		JOptionPane.showMessageDialog(null, output, "Results!",
				JOptionPane.INFORMATION_MESSAGE);
	}
}