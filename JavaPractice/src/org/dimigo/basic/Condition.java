package org.dimigo.basic;

public class Condition {
	public static void main(String[] args){
		int length=10, cost, add;
		String value = "고속버스";
		
		if(value.equals("고속버스")) {
			cost = 850; add = 300;
		} else if(value.equals("경차")) {
			cost = 300; add = 200;
		} else {
			cost = 600; add = 200;
		}
		
		for(int i=20; i<=length; i+=10) {
			cost += add;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리: " + length + "km");
		System.out.println("차량: " + value);
		System.out.println("통행료: " + cost + "원");
	}
}
