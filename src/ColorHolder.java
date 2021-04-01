//Author: Jack Handy
//Date: 3/23/2021
//The ColorHolder class holds the color to pass around the classes in the project

import java.awt.Color;

public class ColorHolder {

	private Color _color;
	
	public ColorHolder(Color color) {
		
		_color = color;
	}
	
	public Color getColor() {
		
		return _color;
	}
	
	public void setColor(Color color) {
		
		this._color = color;
	}
}
