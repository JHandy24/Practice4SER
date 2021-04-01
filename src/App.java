//Author: Jack Handy
//Date: 3/23/2021

import java.awt.Color;
import wheels.users.*;

public class App extends Frame {
	
	private Cartoon cartoon;
	private ButtonPanel buttonPanel;
	private ColorHolder colorHolder;

	public App() {
		
		ColorHolder colorHolder = new ColorHolder(null);
		cartoon = new Cartoon(200, 200, Color.blue, colorHolder);
		cartoon = new Cartoon(450, 200, Color.red, colorHolder);
		buttonPanel = new ButtonPanel(colorHolder);
	}
	
	
//main method calls new app to get program started and create the cartoons, button panel, and color holder.
	public static void main(String[] args) {
		
		new App();

	}

}
