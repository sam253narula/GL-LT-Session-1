package com.a.memoryanalyzer;

public class ConsumeMemory {

	public static void main(String[] args) {
		for (int i = 0; i >=0; i++) {
			System.out.println("hello\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
}
