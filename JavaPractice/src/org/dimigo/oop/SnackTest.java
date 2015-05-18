/**
 * <pre>
 * org.dimigo.oop
 *   _ SnackTest
 * 
 * About :
 * Date : 2015. 5. 18.
 * </pre>
 *
 * @author	: tamiflus
 * @version : 1.0
 */
package org.dimigo.oop;

/**
 * @author tamiflus
 *
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Snack[] arr = new Snack[] {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		int sum = 0;
		
		for (Snack s : arr) {
			s.printSnack();
			sum += s.calcPrice();
		}
		
		System.out.println("총 구매 금액 : " + String.format("%,d", sum) +"원");

	}

}
