//Author: Jack Handy
//Date: 3/23/2021

import java.awt.Color;
import java.awt.event.MouseEvent;

//implements the interface mover which has mouseDragged and mousePressed method 
public class Cartoon implements Mover {

	private Head head;
	private Body body;
	private int x;
	private int y;
	private int _previousMouseX;
	private int _previousMouseY;

	public Cartoon(int x, int y, Color c, ColorHolder colorHolder) {

		body = new Body(c, x, y, this, colorHolder);

		head = new Head(c, x - 15, y - 80, this, colorHolder);

		setLocation(x, y);
	}

	// sets the location of body and head (passes parameters)
	public void setLocation(int x, int y) {

		this.x = x;
		this.y = y;
		body.setLocation(x, y);
		head.setLocation(x - 30, y - 85);
	}

	public int getX() {

		return x;
	}

	public int getY() {

		return y;
	}

	//mousePressed method sets the last mouse coordinates to the current position when pressed
	public void mousePressed(MouseEvent e) {

		_previousMouseX = e.getX();
		_previousMouseY = e.getY();

	}

	//mouseDragged method sets the location to the X and Y position plus the distance it traveled. Then it updates previous mouse.
	public void mouseDragged(MouseEvent e) {

		int x = (e.getX() - _previousMouseX);
		int y = (e.getY() - _previousMouseY);

		setLocation(getX() + x, getY() + y);

		_previousMouseX = e.getX();
		_previousMouseY = e.getY();
	}

}
