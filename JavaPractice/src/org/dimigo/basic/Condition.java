package org.dimigo.basic;

public class Condition {
	public static void main(String[] args){
		int length=10, cost, add;
		String value = "��ӹ���";
		
		if(value.equals("��ӹ���")) {
			cost = 850; add = 300;
		} else if(value.equals("����")) {
			cost = 300; add = 200;
		} else {
			cost = 600; add = 200;
		}
		
		for(int i=20; i<=length; i+=10) {
			cost += add;
		}
		
		System.out.println("<< ��ӵ��� ����� ��� >>");
		System.out.println("�Ÿ�: " + length + "km");
		System.out.println("����: " + value);
		System.out.println("�����: " + cost + "��");
	}
}
