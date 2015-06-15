/**
 * <pre>
 * org.dimigo.oop
 *   _ PiggyBankTest
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
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Class & value array
		FamilyMember[] members = {
			new FamilyMember("아빠"), new FamilyMember("엄마"),
			new FamilyMember("나"), new FamilyMember("남동생")
		};
		int[] arr = {10000, 5000, 2000, 1000};
		
		FamilyMember.printMemberCnt();
		//Insert Money into PiggyBank Static value
		for(int i=0; i<members.length; i++) {
			PiggyBank.putMoney(members[i], arr[i]);
		}
		//Print all amount
		PiggyBank.printBalance();
		PiggyBank.putMoney(members[2], 1000);
		PiggyBank.printBalance();
		
	
		//Get Some money
		PiggyBank.stoleMoney(members[3], 11000);
		PiggyBank.printBalance();
		PiggyBank.stoleMoney(members[1], 10000);
		PiggyBank.printBalance();
	}

}
