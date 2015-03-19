package org.dimigo.basic;

public class TypeCasting {
	public static void main(String[] args) {
		int pay = 1700000;
		int worker = 3;
		int shop = 1500;
		
		long cost = ((long) pay) * ((long) worker) * ((long) shop) * 12L;
		
		System.out.println("월 평균 급여 : " + String.format("%,d", pay) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", worker) + "명");
		System.out.println("점포 수 : " + String.format("%,d", shop) + "개\n");
		
		System.out.println("연간 인건비 : " + String.format("%,d", cost) + "원");
	}
}
