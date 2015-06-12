/**
 * <pre>
 * org.dimigo.oop
 *   _ PiggyBank
 * 
 * About :
 * Date : 2015. 6. 12.
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
public class PiggyBank {
	//Create Static balance Value
	private static int balance;
	
	//Put money
	public static void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.printf("%s %d원 넣음\n", member.getMemberName(), amount);
	}
	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : "+balance+"원");
	}
}
