package com.cg.linecount;

//importing java.io
import java.io.*;

//class to count no. of lines in a file
public class LineCount {

	public static void main(String[] args) {

		try {
			// Getting the file in f
			File f = new File("P:\\Users\\alorai\\Desktop\\alorai\\Supple.java");
			if (f.exists()) {
				FileReader fr = new FileReader(f); // Reading the file
				LineNumberReader l = new LineNumberReader(fr); // Reading line
																// by line
				int numberOfLine = 0;
				while (l.readLine() != null) {
					numberOfLine++; // No of line incremented by 1
				}
				System.out.println("No. of Lines =" + numberOfLine);
				l.close();

			} else {
				System.out.println("File does not exist");
			}

		} catch (IOException e) { // Input Output Exception Handling
			e.printStackTrace();
		}

	}

}
