package chapter2_System;

public class SystemEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i = 0; i <= 10000000; i++) {
			sum += 1;
		}
		
		long time2 = System.currentTimeMillis();
		
		System.out.println(sum);
		System.out.println(time2 - time1);
	}

}
