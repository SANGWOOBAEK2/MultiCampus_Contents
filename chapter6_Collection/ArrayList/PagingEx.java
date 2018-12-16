package chapter6_Collection.ArrayList;

import java.util.List;
import java.util.Scanner;

public class PagingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Member.getTestList();
		Pagination<Member> pgn = new Pagination<>(list);

		try {
			int requestPage = 1;
			while (true) {
				List<Member> myList = pgn.getPage(requestPage);
				printArr(requestPage, myList);
				System.out.println("N : 다음 목록, P : 이전 목록, Q : 종료");
				System.out.println("명령어 입력해주세요 : ");
				Scanner scanner = new Scanner(System.in);
				String str = scanner.nextLine();
				
				switch (str) {
				case "n":
					requestPage++;
					break;
				case "p":
					requestPage--;
					break;
				case "q":
					System.exit(0);
					break;
				}
				
				if(requestPage > pgn.getTotalPage() || requestPage < 1) requestPage = 1;
				System.out.println("요청 페이지 : " + requestPage);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("페이지 번호 입력 오류");
			e.printStackTrace();
		}

	}
	
	public static void printArr(int page, List<Member> list) {
		System.out.println("--------------------");
		for(Member m : list) {
			System.out.println("ID : " + m.getUserId() + ", AGE : " + m.getAge());
		}
		System.out.println("--------------------");

	}

}
