package com.h.deadlock.solution;

//Problem of deadlock can be avoided or fixed by following the same sequence of acquiring lock in application threads that execute after after other
public class DeadLockDemo {
	
	public static void main(String[] args) {
		final Class1 obj1 = new Class1();
		final Class2 obj2 = new Class2();
		
		Thread thread1 = new Thread(new Thread1(obj1, obj2));
		Thread thread2 = new Thread(new Thread2(obj1, obj2));
		thread1.start();
		thread2.start();
		
	}
}
