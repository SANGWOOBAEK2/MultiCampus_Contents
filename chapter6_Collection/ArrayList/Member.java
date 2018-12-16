package chapter6_Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Member implements Comparable<Member>{
	private String userId;
	private int age;
	private String region;
	
	/*
	 * TEST용 list 생성 메소드
	 */
	public static List<Member> getTestList() {
		List<Member> list = new ArrayList<Member>();
		String []regions = {"seoul", "busan", "incheon", "suwon"};
		Random random = new Random();
		for (int i = 1; i <= 32; i++) {
			int randomValue = random.nextInt(regions.length);
			list.add(new Member("hotteok " + i, i, regions[randomValue]));
		}
		return list;
	}
	
	public Member(String userId, int age) {
		super();
		this.userId = userId;
		this.age = age;
	}

	public Member(String userId, int age, String region) {
		super();
		this.userId = userId;
		this.age = age;
		this.region = region;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return this.userId.compareTo(o.getUserId());
	}
	
	
	
}
