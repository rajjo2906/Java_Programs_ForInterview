package StringProgramAndArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class Practice {
	
	public static void main (String args[]) {
		
				int k = 3;
				int [] a = new int[]{2,4,6,8,3,9}; 
				int[] temp = new int[k];
		        int ind = 0;


		        for(int i=0; i<a.length; i++) {

			        if(i>=k){
			
			            a[ind] = a[i];
			            ind++;
			    }
			    
			    else{
			        temp[i] = a[i];
			    }

		    }
		        
		    
		    for(int j=0; j<temp.length; j++) {

			a[a.length-k] = temp[j];
			k--;
		    }
		    
		    for(int j=0; j<a.length; j++) {

			System.out.print(a[j] + " ");
		    }

		    
			}

		
		/*int [] a = new int[]{-12,-6,-8,2,3,5,6,8,6};
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i =0; i< a.length; i++) {
			arr.add(a[i]);
		}
		
		arr.add(0);
		
		

		Collections.sort(arr);
		System.out.println(arr);*/
		
		
		//System.out.println(a[a.length]);
		
		// find frequency of each character and find the no. of characters to be removed from two string to make string anagram.
		/*String str1 = "bcadeh";
		String str2 = "hea";
		int result = 0;
		
		int count1[] = new int[26];  
        int count2[] = new int[26]; 
  
        
        //System.out.println('c' - 'a');
    
        for (int i = 0; i < str1.length() ; i++) 
            count1[str1.charAt(i) -'a']++; 
        
        for (int i = 0; i < count1.length ; i++) 
            System.out.print(count1[i]);

        for (int i = 0; i < str2.length() ; i++) 
            count2[str2.charAt(i) -'a']++;
        
        System.out.println();
  
        for (int i = 0; i < count2.length ; i++) 
            System.out.print(count2[i]);

         
        for (int i = 0; i < 26; i++) {
            result += Math.abs(count1[i] - count2[i]);
            } */
		
//*******************************************************************************************************************
//two string swap without using third variable
		/*String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        System.out.println(a);
        b = a.substring(0, a.length() - b.length());  
        System.out.println(b);
        a = a.substring(b.length());  
        System.out.println(a);
        System.out.println("After : " + a + " " + b); */
        
        //System.out.println(result);
}
