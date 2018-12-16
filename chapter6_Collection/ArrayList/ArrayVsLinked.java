package chapter6_Collection.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVsLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		double startTime;
		double endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000000; i++) {
			arrayList.add(0, 1);
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime - startTime);
		
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100000000; i++) {
			linkedList.add(0, 1);
		}
		endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
	}

}
