package com.g.volatilekeyword;

public class ObserverThread extends Thread {

	@Override
	public void run() {
		int value = VolatileDemo.SHARED_INT_VALUE;
		while(value < 5) {
			if(value!= VolatileDemo.SHARED_INT_VALUE) {
				try {
					Thread.sleep(1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("value got changed, new value is: "+ VolatileDemo.SHARED_INT_VALUE);
				value=VolatileDemo.SHARED_INT_VALUE;
			}
		}
		
	}

}
