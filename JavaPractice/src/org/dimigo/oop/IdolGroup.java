/**
 * <pre>
 * org.dimigo.oop
 *   _ IdolGroup
 * 
 * About :
 * Date : 2015. 5. 28.
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
public class IdolGroup {
	public static void main(String[] args) {
		//Init all Array
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = {
				{"G-Dragon", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		
		//Print all
		for(int i=0; i < idolGroup.length; i++) {
			System.out.println("<<"+idolGroup[i]+"멤버"+">>");
			for(String j :  members[i]) {
				System.out.println(j);
			}
			System.out.println();
		}
	}
}
