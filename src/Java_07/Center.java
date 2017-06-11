package Java_07;

import java.awt.*;

class Center {
	public static void main(String args[]) {

		// Get the center point using getCenterPoint() in GraphicsEnvironment
		// class
		Point p = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();

		// Print the x co-ordinate
		System.out.println("The center x co-ordinate is " + p.x);

		// Print the y co-ordinate
		System.out.println("The center y co-ordinate is " + p.y);

	}
}