package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String ni = JOptionPane.showInputDialog("How many nickels do you have?");
		int nickel = Integer.parseInt(ni);
		String di = JOptionPane.showInputDialog("How much dimes do you have?");
		int dime = Integer.parseInt(di);
		String qu = JOptionPane.showInputDialog("How much quarters do you have?");
		int quarter = Integer.parseInt(qu);
		double total = (nickel * 0.05) + (dime *0.10) + (quarter * 0.25);
		System.out.println("You have $" + total);
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
		
		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

