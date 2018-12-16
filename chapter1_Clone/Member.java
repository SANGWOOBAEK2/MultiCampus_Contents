package chapter1_Clone;
//implemens clonable 생략하고 실행해 볼것 
//예외 두개 발생!(clone() 오류와 null point exception
public class Member implements Cloneable{
	public String id;
	public String name;
	
	public Member(String id, String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return cloned;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : " + id + ", name : " + name;
	}
}
