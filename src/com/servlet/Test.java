package com.servlet;


public class Test {

	public static void main(String[] args) {

		String text = "AA/ic//ic/BB";
		String[] faces = {"/id","/ic"};

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '/') {
				String mayFace = "/" + text.charAt(i + 1) + text.charAt(i + 2);
				System.out.println(mayFace);
			}

		}

	}
}
