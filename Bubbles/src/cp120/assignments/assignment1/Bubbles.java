package cp120.assignments.assignment1;
import edu.uweo.javaintro.tools.Turtle;

public class Bubbles {
	public static void main (String[] args){
		Turtle bacon = new Turtle();
		bacon.switchTo(Turtle.GREEN);
		
		bacon.move(0, -230);
		bacon.fillCircle(128);
		
		bacon.move(0, 192);
		bacon.fillCircle(64);
		
		bacon.move(0, 96);
		bacon.fillCircle(32);
		
		bacon.move(0, 48);
		bacon.fillCircle(16);
		
		bacon.move(0, 24);
		bacon.fillCircle(8);
		
		bacon.move(0, 12);
		bacon.fillCircle(4);
	}
}
