package org.dimigo.basic;

public class TypeCasting {
	public static void main(String[] args) {
		int pay = 1700000;
		int worker = 3;
		int shop = 1500;
		
		long cost = ((long) pay) * ((long) worker) * ((long) shop) * 12L;
		
		System.out.println("�� ��� �޿� : " + String.format("%,d", pay) + "��");
		System.out.println("���� �� ���� �� : " + String.format("%,d", worker) + "��");
		System.out.println("���� �� : " + String.format("%,d", shop) + "��\n");
		
		System.out.println("���� �ΰǺ� : " + String.format("%,d", cost) + "��");
	}
}
