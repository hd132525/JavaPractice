/**
 * <pre>
 * org.dimigo.inheritance
 *   _ Figure
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
public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	/**
	 * @param centerX2
	 * @param centerY2
	 */


	protected double calcArea() {
		return 0.0;
	}
}
