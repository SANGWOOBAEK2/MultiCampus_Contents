package chapter5_Generic.Generic2;

import java.util.Arrays;

public class ChildProductAndStorageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr = {"a", "b", "c"};
		System.out.println(Arrays.toString(arr));
		
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("smart tv");
		product.setCompany("samsung");
		
		Storage<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 100);
		Tv tv = storage.get(0);
		
	}

}
