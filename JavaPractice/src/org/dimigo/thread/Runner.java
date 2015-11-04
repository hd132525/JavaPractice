package org.dimigo.thread;

import java.util.Random;

public class Runner extends Thread{
	private String name;
	
	public Runner() {
	}
	
	public Runner(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		int time;
		
		System.out.println(name + " 출발");
		try {
			for(int i=100; i>=0; i-=10) {
				System.out.printf("%s %d 미터\n", name, i);
				//time = new Random().nextInt(1000);
				time = 1000;
				Thread.sleep(time);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " 골인");
	}
}
