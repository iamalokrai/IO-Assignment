package com.cg.fileexist;

//importing java.io
import java.io.File;

public class FileExist {

	public static void main(String[] args) {
		// Getting the file
		File f = new File("P:\\Users\\alorai\\Desktop\\alorai");
		if (f.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("File does not exists");
		}

	}

}
