package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "������";
		boolean isGirl = true;
		int age = 23;
		double tall = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("�̸� : " + name);
		System.out.printf("���� : ");
		if (isGirl) System.out.println("����");
		else System.out.println("����");
		System.out.printf("���� : %d ��\n", age);
		System.out.printf("Ű : %.1f cm\n", tall);
		System.out.printf("������ : %.1f kg\n", weight);
		System.out.println("������ : " + bloodtype + " ��");
	}

}
