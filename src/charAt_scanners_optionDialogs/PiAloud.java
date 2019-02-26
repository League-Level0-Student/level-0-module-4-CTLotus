package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	String pi = "3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975665933446128475648233786783165271201909145648566923460348610454326648213393607260249141273724587006606315588174881520920962829254091715364367892590360011330530548820466521384146951941511609433057270365759591953092186117381932611793105118548";;
	System.out.println(pi.charAt(0));
	for (int i = 0; i < pi.length(); i++) {
	System.out.println(pi.charAt(i));
	getInputFromUser();
	if (pi.equals(i)) {
		JOptionPane.showMessageDialog(null, "You are correct");
	}
}
	
	
	
	
} // 2. Make a String variable to hold the value of Pi. You could use
		// http://www.piday.org/million/ for the value.

	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second
	// is "pi.charAt(1)"

	// 4. Print ALL the digits of of Pi (hint: use a loop)

	// 5. Use the speak() method to speak all the digits of Pi.

	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print
	// "incorrect" to System.err.println

	static void speak(char characterToSpeak) {
		System.out.println(characterToSpeak);
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}
