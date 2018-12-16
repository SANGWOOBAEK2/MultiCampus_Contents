package chapter6_Collection.HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import edu.autoar.base.util.Input;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		int tryNum = 1;
		
		while(true) {
			System.out.println("ID와 PWD를 입력하세요");
			String id = Input.getString("ID : ");
			String pwd = Input.getString("PWD : ");
			
			try {
				if(tryNum != 3) {
					check(map, id, pwd);
					System.out.println("login success");
				}
				else {
					System.out.println("3번 초과하였습니다.");
					System.exit(0);
				}
			} catch (LoginFailException e) {
				// TODO Auto-generated catch block
				tryNum++;
				System.out.println(e.getMessage());
			}
			System.out.println();
		}
	}
	
	public static void check(Map<String, String> map, String id, String pwd) 
		throws LoginFailException{
		if(map.containsKey(id)) {
			if(!map.get(id).equals(pwd))	throw new LoginFailException("pwd not matched");
		}else throw new LoginFailException("id not exist");
	}
}
