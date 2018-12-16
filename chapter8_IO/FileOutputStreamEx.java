package chapter8_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		String originFileName = "C:/Temp/Koala.jpg";
		String targetFileName = "C:/Temp/Koala_copy.jpg";

		try (
				FileInputStream fis = new FileInputStream(originFileName);
				FileOutputStream fos = new FileOutputStream(targetFileName);
		) {
			int readByteNo;
			byte[] readBytes = new byte[100];
			while( (readByteNo = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteNo);
			}
			fos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
