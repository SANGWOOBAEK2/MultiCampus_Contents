package chapter5_Generic.Generic2;

public class ProductEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv, String> pro1 = new Product();
		pro1.setKind(new Tv());
		pro1.setModel("smart tv");
		Tv tv = pro1.getKind();
		String tvModel = pro1.getModel();
		
		Product<Car, String> pro2 = new Product<>();
		pro2.setKind(new Car());
		pro2.setModel("디젤");
		Car car = pro2.getKind();
		String carModel = pro2.getModel();
	}

}
