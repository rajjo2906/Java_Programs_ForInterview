package StringProgramAndArrays;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string: ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		//String s = "I work in Infosys Company";
		String str = "",rev = "";
		
		String[] c = s.split(" ");
		// System.out.println(c[4]);
		
		for(int i=0; i<c.length; i++) {
			for(int j=c[i].length()-1; j>=0;j--) {
				rev = rev + c[i].charAt(j);
			}
			
			c[i] = rev;
			rev = "";
		}
		
		for(int k=0; k<c.length; k++)
		{
			 str = str + c[k] + " ";
		}
		
		System.out.println(str);
		
		sc.close();
	}

}
