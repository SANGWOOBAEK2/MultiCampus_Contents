package chapter8_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import edu.autoar.base.util.Input;

public class MakeNoteEx {
	public static void main(String[] args) {
		String content = Input.getString("content : ");
		String fName = Input.getString("fileName : ");
	
		File file = new File("c:/Temp", fName);
		try(FileWriter fw = new FileWriter(file);){
			fw.write(content);
			fw.flush();
			System.out.println("complete");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static String getMultiLine(String msg) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println(msg);
		while(true) {
			String line = scanner.nextLine();
			if(line.equals("END")) break;
			sb.append(line + "\r\n");
		}
		return sb.toString();
	}
	
	public static void save(File file, String content) throws Exception {
		try (
			FileWriter fw = new FileWriter(file);
	){
			fw.write(content);
			fw.flush();
		}
	}
	public static String load(File file) {
		String content = "";
		StringBuilder sb = new StringBuilder();
		try(FileReader fr = new FileReader(file);){
			int readCharNo;
			char[] cbuf = new char[100];
			while((readCharNo = fr.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCharNo);
				//String data = new String(cbuf, 0, readCharNo);
				//sb.append(data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return content;
	}
}