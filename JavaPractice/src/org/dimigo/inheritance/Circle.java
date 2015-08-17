/**
 * <pre>
 * org.dimigo.inheritance
 *   _ Circle
 * 
 * About :
 * Date : 2015. 8. 12.
 * </pre>
 *
 * @author	: tamiflus
 * @version : 1.0
 */
package org.dimigo.inheritance;

/**
 * @author tamiflus
 *
 */
public class Circle extends Figure {
	private int radius;
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	public Circle(int radius){
		super(0, 0);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return radius*radius*Math.PI;
	}
	
	protected void printCenter() {
		System.out.printf("원 ");
		super.printCenter();
	}
}
