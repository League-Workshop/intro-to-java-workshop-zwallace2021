package day1.robot;

import java.awt.Color;
import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot r2d2 = new Robot();
	r2d2.sparkle();
	r2d2.setSpeed(4);
	r2d2.move(100);
	r2d2.turn(90);
	r2d2.setPenColor(Color.MAGENTA);
	r2d2.penDown();
	
	r2d2.move(200);;
	r2d2.turn(90);
	r2d2.move(200);
	r2d2.turn(90);
	r2d2.move(200);
	r2d2.turn(90);
	r2d2.move(200);
r2d2.hide();

		
		
	}
}
