package chapter4_DecimalFormat;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
	
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));

	}

}
