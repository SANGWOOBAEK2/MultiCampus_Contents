package edu.autoar.base.util;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Input {
	public static String getString(String str) {
		System.out.print(str + " : ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public static int selectList(List<String> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d] %s\n", i + 1, list.get(i));
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("선택 : ");
		return scanner.nextInt() - 1;
	}
}
