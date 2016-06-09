import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
Robot bob = new Robot();
String colorchoice = JOptionPane.showInputDialog("What color would you like bob the robot to draw with?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
bob.penDown();
if(colorchoice.equalsIgnoreCase("Blue")){
	bob.setPenColor(0,0,200);
}
else if(colorchoice.equalsIgnoreCase("green")){
	bob.setPenColor(150,0,0);
}
else{
	bob.setPenColor(0,0,0);
}
   	 // 2. set the pen width to 10
bob.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 bob.move(200);
   	 bob.turn(90);
   	 bob.move(200);
   	 bob.turn(90);
   	 bob.move(200);
   	 bob.turn(90);
   	 bob.move(200);
    }

}