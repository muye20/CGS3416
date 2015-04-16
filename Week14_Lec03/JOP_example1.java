// Illustrates concatenation operation in output statements

import javax.swing.JOptionPane;

public class JOP_example1 {
	public static void main(String[] args) {
		// concatenation of two strings
		String s1 = "Here are some message boxes for your\n"
				+ "edification, education, and enjoyment\n";

		JOptionPane.showMessageDialog(null, s1);

		String s2 = "Dragons have very sharp teeth.";
		String s3 = "A dragon ate my grandma by mistake...";
		String s4 = "Look out!  The dragon is behind you!!!";
		String s5 = "Are you missing a leg?\n"
				+ "or did you only have one to begin with?";

		JOptionPane.showMessageDialog(null, s2, "Just so you'll know",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, s3, "Oops!",
				JOptionPane.ERROR_MESSAGE);

		JOptionPane.showMessageDialog(null, s4, "Danger, Will Robinson",
				JOptionPane.WARNING_MESSAGE);

		JOptionPane.showMessageDialog(null, s5, "Just curious...",
				JOptionPane.QUESTION_MESSAGE);

		String all = s2 + '\n' + s3 + '\n' + s4 + '\n' + s5;

		JOptionPane.showMessageDialog(null, all, "And once more",
				JOptionPane.PLAIN_MESSAGE);

	}
}