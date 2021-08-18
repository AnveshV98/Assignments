package com.assignments.java.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteArray {

	public static void main(String[] args) {
		String file_name = "D:\\STS4\\workspace1\\Assignments\\src\\com\\assignments\\java\\fileio\\company\\basicInfo.txt";
        InputStream fins = null;
        try {
            fins = new FileInputStream(file_name);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fins != null) fins.close();
            } catch(Exception ex){
                 
            }
        }

	}

}
