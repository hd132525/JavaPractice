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
	
	public static void stoleMoney(FamilyMember member, int amount) {
		if(balance - amount < 0) {
			System.out.printf("%d원을 가져가려 했는데 돈이 부족합니다.\n", amount);
			amount = balance;
		}
		balance -= amount;
		System.out.printf("%s %d원 가져감\n", member.getMemberName(), amount);
	}
}
