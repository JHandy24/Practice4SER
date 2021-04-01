//Author: Jack Handy
//Date: 3/23/2021

import java.awt.event.MouseEvent;
import wheels.users.*;
//extends superclass ellipse
public class DraggableHead extends Ellipse {
	
	private Mover mover;
	private ColorHolder colorHolder;
	
	public DraggableHead(Mover mover, int x, int y, ColorHolder colorHolder) {
		
		this.mover = mover;
		this.colorHolder = colorHolder;
	}
	//implements method from mover interface mousePressed. 
	public void mousePressed(MouseEvent e) {
		
		mover.mousePressed(e);
	}
	//implements method from mover interface mouseDragged
	public void mouseDragged(MouseEvent e) {
		
		mover.mouseDragged(e);
		
	}
	//sets color to current color of colorHolder object when mouse is clicked
	public void mouseClicked(MouseEvent e) {
		
		setColor(colorHolder.getColor());
	}

}
