/**
 * <pre>
 * org.dimigo.inheritance
 *   _ FigureTest
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
public class FigureTest {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Triangle t = new Triangle(10,10,5,8);
		Rectangle r = new Rectangle(20,20,5,8);
		
		System.out.println("원의 넓이 : " + String.format("%.1f", c.calcArea()));
		System.out.println("삼각형 넓이 : " + String.format("%.1f", t.calcArea()));
		System.out.println("사각형 넓이 : " + String.format("%.1f", r.calcArea()));
	}
}
