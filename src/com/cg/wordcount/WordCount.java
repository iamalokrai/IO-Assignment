package com.cg.wordcount;

import java.io.*;

//Class to count the words in the file
public class WordCount {

	public static void main(String[] args) {

		BufferedReader reader = null;
		int count = 0;
		String thisLine = null;
		try {
			reader = new BufferedReader(new FileReader("P:\\Users\\alorai\\Desktop\\alorai\\Supple.java"));
			thisLine = reader.readLine();
			while (thisLine != null) {
				String[] words = thisLine.split(" ");
				count = count + words.length;
			}
			reader.close();
			System.out.println(count);
			// reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println(count);

	}

}
