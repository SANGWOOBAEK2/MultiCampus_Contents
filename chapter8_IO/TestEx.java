package chapter8_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestEx {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/file2.txt");
		byte[] data = "ABC".getBytes();
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		for(byte b : data)
			System.out.println(b);
		System.out.println("----------------------------");
	
		try(FileInputStream fis = new FileInputStream("C:/Temp/file2.txt")){
			int readByte;
			byte []bytes = new byte[5];
			while((readByte = fis.read(bytes, 1, 4)) != -1) {
				for(int i = 0; i < bytes.length; i ++) {
					System.out.print("num("+i+"): " + bytes[i] + ", char : " +(char)bytes[i]+ " / ");
				}
				System.out.println();
			}
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}