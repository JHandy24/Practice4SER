//Author: Jack Handy
//Date: 3/23/2021

import java.awt.*;
import wheels.users.Rectangle;
import wheels.users.RoundedRectangle;

public class Body {

	private DraggableBody body;
	private Rectangle arm;
	private RoundedRectangle lLeg;
	private RoundedRectangle rLeg;
	private int x;
	private int y;

public Body(java.awt.Color color, int x, int y, Cartoon cartoon, ColorHolder colorHolder) {

	body = new DraggableBody(colorHolder);
	body.setColor(color);
	body.setSize(10, 100);

	arm = new Rectangle();
	arm.setColor(color);
	arm.setSize(60, 10);
	
	lLeg = new RoundedRectangle();
	lLeg.setColor(color);
	lLeg.setSize(40, 40);
	
	rLeg = new RoundedRectangle();
	rLeg.setColor(color);
	rLeg.setSize(30,30);

	
	setLocation(x, y);
	
}

//gets color of body
public Color getColor() {
	
	return body.getColor();
}
//sets color of body
public void setColor(Color c) {
	
	body.setColor(c);
}

//sets the location of the body and then the arm, lLeg, and rLeg relative to the body
public void setLocation(int x, int y) {
		
	body.setLocation(x + this.body.getTotalX(), y + this.body.getTotalY());
	arm.setLocation(x, y+20);
	lLeg.setLocation(x-10, y+60);
	rLeg.setLocation(x+30, y+60);
}
}