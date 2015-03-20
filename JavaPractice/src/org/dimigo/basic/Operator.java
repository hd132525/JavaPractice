package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		
		double trape = (double)(a+b)*h1/2.0;
		double parallel = (double)a * h2;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.printf("사다리꼴 넓이 : %.1f\n", trape);
		System.out.printf("평행사변형 넓이 : %.1f\n\n", parallel);
		
		if(trape > parallel) {
			System.out.printf("사다리꼴이 평행사변형보다 %.1f 더 큽니다.", trape-parallel);
		} else if (trape == parallel) {
			System.out.printf("사다리꼴이 평행사변형보다 %.1f 로 같습니다.", trape);
		} else {
			System.out.printf("평행사변형이 사다리꼴보다 %.1f 더 큽니다.", parallel-trape);
		}
	}
}
