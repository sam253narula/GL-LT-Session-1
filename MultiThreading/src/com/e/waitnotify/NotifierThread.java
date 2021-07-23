package com.e.waitnotify;

/*Whenever you use wait and notify method,
then it is mandatory to use synchronized block, to make the thread owner of the object or lets say in simple words to
acquire lock on the object, at a time only one thread can acquire lock on the object*/ 
public class NotifierThread implements Runnable {

	private Integer value;

	public NotifierThread(Integer value) {
		this.value = value;
	}

	@Override
	public void run() {
		synchronized (value) {
			try {
				Thread.sleep(1000);
				System.out.println("Now Notifier Thread begins notifying the waiting the thread");
				value.notify();
				System.out.println("Notifier Thread finished Notifying the waiting threads.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
