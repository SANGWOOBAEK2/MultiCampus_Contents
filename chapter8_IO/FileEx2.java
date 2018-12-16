package chapter8_IO;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

public class FileEx2 {
	/*
	 * 정규표현
	 * Ex. .*\\.(jpg|mp3|mkv|gif) 
	 */
	public static void main(String[] args) {
		File temp = new File("C:/temp");
		
		/*
		 * 전략 패턴이자 OCP! 효율적인 메소드!
		 */
		File[] contents = temp.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				// TODO Auto-generated method stub
				return file.isFile() && file.length() < 1024;
			}
		});
		/*File[] contents = temp.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				//return (name.substring(name.indexOf(".") + 1, name.length()).toLowerCase().equals("jpg")) ? true : false;
			    name = name.toLowerCase();
			    return name.endsWith(".jpg");
			}
		});*/
		
		
		Arrays.sort(contents, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				// TODO Auto-generated method stub
				// 유형이 다른 경우 디렉토리가 앞서도록 결정
				if(!(o1.isFile() == o2.isFile())) {
					return o1.isDirectory() ? -1 : 1; //디렉토리의 경우 먼저 배치하겠다.
				}
				return o1.compareTo(o2);
			}
		});
		
		for(File f : contents) {
			System.out.println(f.getName() + "\t" + f.length());
		}
	}

}
