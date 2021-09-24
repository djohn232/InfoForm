/**
 * @author Delanie Johnson - dmjohnson33 
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
package model;

/**
 * @author delan
 *
 */
public class colorInfo {

	public String getColor() {
		return color;
	}

	private String color; 
	
	public colorInfo() {
		super();
	}
	
	public colorInfo(String color) {
		super();
		this.color = color;
		setColor(color);
	}
	
	public void setColor(String color){
		this.color = color;
		setColors(color);
	}
	
	public void setColors(String color) {
		color = "I love that color!";
	}
	
	@Override
	public String toString() {
		return "Your Color Information: " + color + "!";
	}
}
