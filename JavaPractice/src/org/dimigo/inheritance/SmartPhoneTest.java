package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		IPhone iphone = new IPhone("iPhone 6", "애플", 700000);
		Galaxy galaxy = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(iphone.toString());
		iphone.turnOn();
		iphone.pay();
		iphone.useSpecialFunction(iphone);
		iphone.turnOff();
		
		System.out.println();
		
		System.out.println(galaxy.toString());
		galaxy.turnOn();
		galaxy.pay();
		galaxy.useSpecialFunction(galaxy);
		galaxy.turnOff();
	}

}
