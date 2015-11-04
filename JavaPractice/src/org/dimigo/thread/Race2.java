package org.dimigo.thread;

public class Race2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread runner1 = new Thread(new Runner2("김민준"));
		Thread runner2 = new Thread(new Runner2("김효준"));
		
		System.out.println("main thread start");
		
		runner1.setPriority(Thread.MAX_PRIORITY);
		runner2.setPriority(Thread.MIN_PRIORITY);
		
		runner1.start();
		runner2.start();
		
		System.out.println("main thread end");
	}
}
