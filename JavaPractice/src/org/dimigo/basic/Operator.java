package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		
		double trape = (double)(a+b)*h1/2.0;
		double parallel = (double)a * h2;
		
		System.out.println("<< ���� ���� �� >>");
		System.out.printf("��ٸ��� ���� : %.1f\n", trape);
		System.out.printf("����纯�� ���� : %.1f\n\n", parallel);
		
		if(trape > parallel) {
			System.out.printf("��ٸ����� ����纯������ %.1f �� Ů�ϴ�.", trape-parallel);
		} else if (trape == parallel) {
			System.out.printf("��ٸ����� ����纯������ %.1f �� �����ϴ�.", trape);
		} else {
			System.out.printf("����纯���� ��ٸ��ú��� %.1f �� Ů�ϴ�.", parallel-trape);
		}
	}
}
