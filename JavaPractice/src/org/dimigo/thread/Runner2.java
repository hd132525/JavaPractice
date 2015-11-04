package org.dimigo.thread;

public class Runner2 implements Runnable{
	private String name;
	
	public Runner2() {
	}
	
	public Runner2(String name) {
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
