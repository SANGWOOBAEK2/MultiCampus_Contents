package chapter6_Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Pagination<T> {
	private int totalPage;
	private List<T> list;

	public Pagination(List<T> list) {
		super();
		this.list = list;
		totalPage = (int)Math.ceil(list.size() / 10.);
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	public List<T> getPage(int page){
		List<T> tempList = new ArrayList<T>();
		int firstIndex = (page - 1) * 10;
		int endIndex = (page == totalPage) ? list.size() - 1 : page * 10 - 1;
		for(int i = firstIndex; i <= endIndex; i++)
			tempList.add(list.get(i));
		return tempList;
	}
	

}
