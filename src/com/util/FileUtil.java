package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileUtil {

	public static File createFile(String path, String fileName) {

		File p = new File(path);
		if(!p.exists()){
			p.mkdir();
		}
		
		File file = new File(path, fileName);
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return file;
	}
	
	public static void writeFile(String path, String fileName, String text){
		File file = createFile(path, fileName);
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream(file));
			ps.print(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ps.close();
	}
	
	public static void String2Photo(String photo, String photoName){
		byte[] b= Base64Coder.decodeLines(photo);
		File file=new File("D:/ChartServer/");
		if(!file.exists())
			file.mkdirs();
		try {
			FileOutputStream fos=new FileOutputStream(file.getPath()+"/"+photoName+".png");
			fos.write(b);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
