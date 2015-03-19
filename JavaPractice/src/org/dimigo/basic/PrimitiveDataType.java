package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean isGirl = true;
		int age = 23;
		double tall = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("이름 : " + name);
		System.out.printf("성별 : ");
		if (isGirl) System.out.println("여자");
		else System.out.println("남자");
		System.out.printf("나이 : %d 세\n", age);
		System.out.printf("키 : %.1f cm\n", tall);
		System.out.printf("몸무게 : %.1f kg\n", weight);
		System.out.println("혈액형 : " + bloodtype + " 형");
	}

}
