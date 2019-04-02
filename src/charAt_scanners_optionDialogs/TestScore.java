package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class TestScore {
	public static void main(String[] args) {
		String ask = JOptionPane.showInputDialog(null, "What is your test score?");
		
		double awe = Double.parseDouble(ask);
		
		double overall = awe;
		
		if (awe > 80) {
			JOptionPane.showMessageDialog(null, "Wow! You must studied really hard for the test.");
		}else {
			JOptionPane.showMessageDialog(null, "Maybe next time...");
		}
}
}