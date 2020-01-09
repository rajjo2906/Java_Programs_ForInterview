package StringProgramAndArrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File sr = new File("C:\\Users\\Rajjo29\\Desktop\\Rajat.txt");
		
		BufferedReader br  = new BufferedReader(new FileReader(sr));
		
		String s = br.readLine();
		
		System.out.println(s);
	}

}


