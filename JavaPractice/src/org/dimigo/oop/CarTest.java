/**
 * <pre>
 * org.dimigo.oop
 *   _ CarTest
 * 
 * About :
 * Date : 2015. 4. 13.
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
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Init All class
		Car hyun = new Car();
		Car kia = new Car();
		Car sam = new Car();
		
		//Hyundae Car Initialization
		hyun.setCompany("�����ڵ���");
		hyun.setModel("���׽ý�");
		hyun.setColor("������");
		hyun.setMaxSpeed(225);
		hyun.setPrice(50000000);
		
		//KIA Car Initialization
		kia.setCompany("����ڵ���");
		kia.setModel("K7");
		kia.setColor("���");
		kia.setMaxSpeed(246);
		kia.setPrice(40000000);
		
		//Samsung Car Initialization
		sam.setCompany("�Ｚ�ڵ���");
		sam.setModel("SM7");
		sam.setColor("ȸ��");
		sam.setMaxSpeed(200);
		sam.setPrice(38000000);
		
		//Print All
		System.out.println("<<�ڵ��� ���>>");
		System.out.println("������� : " + hyun.getCompany());
		System.out.println("�𵨸� : " + hyun.getModel());
		System.out.println("���� : " + hyun.getColor());
		System.out.println("�ִ�ӵ� : " + hyun.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", hyun.getPrice())+"��\n");
		
		System.out.println("������� : " + kia.getCompany());
		System.out.println("�𵨸� : " + kia.getModel());
		System.out.println("���� : " + kia.getColor());
		System.out.println("�ִ�ӵ� : " + kia.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", kia.getPrice())+"��\n");
		
		System.out.println("������� : " + sam.getCompany());
		System.out.println("�𵨸� : " + sam.getModel());
		System.out.println("���� : " + sam.getColor());
		System.out.println("�ִ�ӵ� : " + sam.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", sam.getPrice())+"��");
	}

}
