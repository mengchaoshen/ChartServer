package com.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class FileUtil {

	public static File createFile(String path, String fileName) {

		File p = new File(path);
		if (!p.exists()) {
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

	public static void writeFile(String path, String fileName, String text) {
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

	public static void String2Photo(String photo, String photoName) {
		byte[] b = Base64Coder.decodeLines(photo);
		File file = new File("D:/ChartServer/");
		if (!file.exists())
			file.mkdirs();
		try {
			FileOutputStream fos = new FileOutputStream(file.getPath() + "/"
					+ photoName + ".png");
			fos.write(b);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 读取txt文件的内容
	 * 
	 * @param file
	 *            想要读取的文件对象
	 * @return 返回文件内容
	 */
	public static String txt2String(File file) {
		String result = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));// 构造一个BufferedReader类来读取文件
			String s = null;
			while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
				result = result + s;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
