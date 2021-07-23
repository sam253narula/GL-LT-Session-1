package com.problemwithrunnableinterface;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {

	@Override
	public String call() throws Exception {
		for (int i = 0; i < 10000; i++) {
			Thread.sleep(1000);
			System.out.println(i+" while I am not interrupted");
			if (Thread.interrupted()) {
				throw new InterruptedException();
			}
		}

		return "All is Well";
	}

}
