package StringProgramAndArrays;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str1 = "I am using HackerRank to improve to programming";
		String t = "am HackerRank to improve";
		
		String [] s1 = str1.split(" ");
		String [] s2 = t.split(" ");
		
		
		for(int i=0; i<s2.length; i++) {
			boolean flag = false;
			for(int j = 0; j<s1.length; j++) {
				
				if(s2[i].equals(s1[j])) {
					
					flag = true;
					break;
					
				}
							
			}
			
			if(flag == false) {
				System.out.print(s[i] + " ");
			}
		}
		
		
		String [] s1 = str1.split(" ");
		String [] s2 = t.split(" ");
		List<String> result = new ArrayList<String>(); 
		
		
		for(int i=0; i<s2.length; i++) {
			for(int j = 0; j<s1.length; j++) {
				
				if(s2[i].equals(s1[j])) {
					s1[j] = null;
					
				}
							
			}
		}
		
		for(int i =0; i<s1.length;i++) {
            if(s1[i]!=null) {
                result.add(s1[i]);
            }
            
        }
		
		System.out.println(result);
		*/
		
		char[] pwd = new char[]{'R', '@', 'j', '@', 't', '!'};

		String s = new String("R@j@t!");

		System.out.println(pwd); 

		System.out.println(s);
		
		
	}

}
