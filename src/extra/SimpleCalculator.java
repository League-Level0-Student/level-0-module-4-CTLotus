package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
for (int i = 0; i < 5; i++) {
			
		
		String number = JOptionPane.showInputDialog("Pick one number.");
		String number1 = JOptionPane.showInputDialog("Pick another number.");
		
		int res = Integer.parseInt(number);
		int res1 = Integer.parseInt(number1);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Choose an operation", "ASMD", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "addition", "subtraction", "multiplication", "division" },
				null);
		System.out.println(operation);
		int addition = 0;
		int subtraction = 1;
		int multiplication = 2;
		int division = 3;
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if (operation == addition) {
		add (res, res1);
		}
		if (operation == subtraction) {
			subtraction (res, res1);
		}
		if (operation == multiplication) {
			multiplication (res, res1);
		}
		if (operation == division) {
			division (res, res1);
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
}
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int res, int res1) {
		JOptionPane.showMessageDialog(null, res + "+" + res1 +"="+ (res + res1));
	}
	
	static void subtraction(int res, int res1) {
		JOptionPane.showMessageDialog(null, res + "-" + res1 +"="+ (res - res1));
	}
	static void multiplication(int res, int res1) {
		JOptionPane.showMessageDialog(null, res + "x" + res1 +"="+ (res * res1));
	}
	static void division(int res, int res1) {
		JOptionPane.showMessageDialog(null, res + "/" + res1 +"="+ (res / res1));
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}