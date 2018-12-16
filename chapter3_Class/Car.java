package chapter3_Class;

public class Car {
	public String model;
	private String owner;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String model, String owner) {
		super();
		this.model = model;
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
