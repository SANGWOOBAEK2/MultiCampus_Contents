package chapter8_IO;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C://temp/Dir");
		File file1 = new File("C://Temp/file1.txt");
		File file2 = new File("C://Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));

		if (dir.exists() == false)
			dir.mkdirs();
		if (file1.exists() == false)
			file1.createNewFile();
		if (file2.exists() == false)
			file2.createNewFile();
		if (file3.exists() == false)
			file3.createNewFile();

		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("DATE\t\tTIME\tFORM\tSIZE\tNAME");
		System.out.println(("-----------------------------------"));
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}

	}

}
