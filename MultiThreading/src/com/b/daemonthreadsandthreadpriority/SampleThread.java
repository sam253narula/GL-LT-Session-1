package com.b.daemonthreadsandthreadpriority;

public class SampleThread implements Runnable {

	private String name;

	public SampleThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			System.out.println(name+" Before sleeping");
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside SampleThread run method "+ name);

	}
}
