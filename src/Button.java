//Author: Jack Handy
//Date: 3/23/2021

import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.RoundedRectangle;

public class Button extends RoundedRectangle{
	
	private ColorHolder colorHolder;
	private Color color;
	

	public Button(Color color, ColorHolder colorHolder) {
		
		this.color = color;
		setColor(color);
		setSize(30,30);
		this.colorHolder = colorHolder;
}
	//when button is clicked the colorHolder object gets color from getter
	public void mouseClicked(MouseEvent e) {
		
		colorHolder.setColor(getColor());
	}
}