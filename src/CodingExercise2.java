/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
 public static void main(String[] args) {
	String age= JOptionPane.showInputDialog("What is your age??");
int	realage= Integer.parseInt(age);
	 if(realage==(11)){
		 JOptionPane.showMessageDialog(null, "Since u are 11 u were either born in 2004 or 2005.");
	 }
	 else if (realage==(12)){
		 JOptionPane.showMessageDialog(null, "Since u are 12 u were either born in 2003 or 2004.");
	 }
	 else if (realage==(13)){
		 JOptionPane.showMessageDialog(null, "Since u are 13 u were either born in 2002 0r 2003.");
	 }
	 else if (realage==(14)){
		 JOptionPane.showMessageDialog(null, "Sinc u are 14 u were either born in 2001 or 2002.");
	 }
	 else if(realage==(30)){
		 JOptionPane.showMessageDialog(null, "U are wat toooooo old to be playing this game.");
	 }
	 
	 
	 
	 
	 
	 
	 
}
}
