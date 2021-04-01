//Author: Jack Handy
//Date: 3/23/2021

import java.awt.Color;
import wheels.users.RoundedRectangle;

public class ButtonPanel {

	private RoundedRectangle redButton;
	private RoundedRectangle blueButton;
	private RoundedRectangle yellowButton;
	private RoundedRectangle pinkButton;
	//creates all of the buttons 
	public ButtonPanel(ColorHolder colorHolder) {
		
		redButton = new Button(Color.red, colorHolder);
		redButton.setLocation(180, 350);
		
		blueButton = new Button(Color.blue, colorHolder);
		blueButton.setLocation(220, 350);
		
		yellowButton = new Button(Color.yellow, colorHolder);
		yellowButton.setLocation(260, 350);
		
		pinkButton = new Button(Color.pink, colorHolder);
		pinkButton.setLocation(300, 350);
		
	}
}
