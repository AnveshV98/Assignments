package com.assignments.java.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File1ToFile2 {

	public static void main(String[] args) {

		try {


			FileReader fr = new FileReader("D:\\STS4\\workspace1\\Assignments\\src\\com\\assignments\\java\\fileio\\file1.txt");


			FileWriter fw = new FileWriter("D:\\STS4\\workspace1\\Assignments\\src\\com\\assignments\\java\\fileio\\file2.txt");


			String str = "";

			int i;


			while ((i = fr.read()) != -1) {

				str += (char)i;
			}

			System.out.println(str);


			fw.write(str);


			fr.close();
			fw.close();


			System.out.println("File1 data printed in file2");
		}


		catch (IOException e) {


			System.out.println("There are some IOException");
		}

	}

}
