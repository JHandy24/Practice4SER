//Author: Jack Handy
//Date: 3/23/2021

import java.awt.Color;
import wheels.users.Ellipse;
import wheels.users.Rectangle;

public class Head {
	
	private Ellipse head;
	private Ellipse eye1;
	private Ellipse eye2;
	private Rectangle mouth;
	private int _x;
	private int _y;
	private Cartoon cartoon;

	
public Head(java.awt.Color color, int x, int y, Cartoon cartoon, ColorHolder colorHolder) {
	
	_x = x;
	_y = y;
	this.cartoon = cartoon;
	head = new DraggableHead(cartoon,_x, _y, colorHolder);
	head.setColor(color);
	head.setSize(90, 90);
	
	eye1 = new Ellipse();
	eye1.setColor(Color.white);
	eye1.setSize(25, 25);
	
	eye2 = new Ellipse();
	eye2.setColor(Color.white);
	eye2.setSize(25,25);
	
	mouth = new Rectangle();
	mouth.setColor(Color.white);
	mouth.setSize(40, 14);
	
	this.setLocation(_x, _y);
}

//sets location of head. eye1, eye2, and mouth are all set relative to head. 
public void setLocation(int x, int y) {
	_x = x;
	_y = y;
	head.setLocation(_x, _y);
	eye1.setLocation(_x+25, _y+25);
	eye2.setLocation(_x+50, _y+25);
	mouth.setLocation(_x+30, _y+60);
	
	}
}