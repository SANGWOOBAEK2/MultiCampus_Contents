package chapter8_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileReader fr = new FileReader("C:/Temp/file1.txt")) {
			int readCharNo;
			char[] cbuf = new char[100];
			while ((readCharNo = fr.read(cbuf)) != -1) {
				String data = new String(cbuf, 0, readCharNo);
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
