package chapter1_hashCode;

public class Key {
	public String number;
	
	public Key(String number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number.hashCode();
	}
}
