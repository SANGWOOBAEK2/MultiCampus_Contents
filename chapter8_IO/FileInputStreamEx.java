package chapter8_IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("C:/Temp/file2.txt")) {
			int data;
			while ((data = fis.read()) != -1) {
				System.out.write(data);
				System.out.println(", " + data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		/*FileInputStream fis = null;
		try {
			// filenotfound exception
			// 권한 exception
			fis = new FileInputStream("C:/Temp/file2.txt");
			System.out.println(fis.read());
			int data;
			// io exception
			while ((data = fis.read()) != -1) {
				System.out.write(data);
			}
			return;
			// close exception
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} finally { //fianlly는 return을 만나도 실행됨.
			System.out.println(("test"));
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}*/
	}
}
