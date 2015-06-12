/**
 * <pre>
 * org.dimigo.oop
 *   _ FamilyMember
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
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName() { return memberName; }
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원수 : " + memberCnt);
	}
}
