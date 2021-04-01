//Author: Jack Handy
//Date: 3/23/2021

import java.awt.event.MouseEvent;
import wheels.users.*;
//extends superclass Rectangle
public class DraggableBody extends Rectangle {
	
	private int _previousMouseX;
	private int _previousMouseY;
	private int totalDistanceX;
	private int totalDistanceY;
	private ColorHolder colorHolder;
	
	public DraggableBody(ColorHolder colorHolder) {
		
		this.colorHolder = colorHolder;
		
	}
	//when mouse is pressed previous mouse is updated 
	public void mousePressed(MouseEvent e) {
		
		_previousMouseX = e.getX();
		_previousMouseY = e.getY();
		
	}
	//sets location to current plus distance moved. Stores total distance traveled. 
	public void mouseDragged(MouseEvent e) {
		
		int x = (e.getX() - _previousMouseX);
		int y = (e.getY() - _previousMouseY);
		
		setLocation(getXLocation() + x, getYLocation() + y);
		
		_previousMouseX = e.getX();
		_previousMouseY = e.getY();
		
		totalDistanceX += x;
		totalDistanceY += y;
	}
	//gets total distance x
	public int getTotalX() {
		return totalDistanceX;
	}
	//gets total distance y
	public int getTotalY() {
		return totalDistanceY;
	}
	//sets color to current color in color holder object when mouse is clicked
	public void mouseClicked(MouseEvent e) {
		
		setColor(colorHolder.getColor());
	}
}
