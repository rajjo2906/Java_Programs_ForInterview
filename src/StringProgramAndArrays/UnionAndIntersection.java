package StringProgramAndArrays;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = new int[]{2,3,4,5,6};
		int [] b = new int[]{1,2,5,6};
		
		Set<Integer> se = new HashSet<Integer>();
		
		for(int i=0; i< a.length; i++) {
			se.add(a[i]);
		}
		
		//union
		
//		for(int i=0; i< b.length; i++) {
//			
//			if(se.add(b[i]) == false) {				// union
//				System.out.println(b[i]);
//			}
//		}
		
		// intersection
		for(int i=0; i< b.length; i++) {
			
			se.add(b[i]);
			}
		
		System.out.println(se);
		

	}
	
	
	//***************************************************************
	//For Best Method(having only on loop)
	//***************************************************************
	
	
	/* i=0, j=0;
	 * while (i < n && j < m)  // where n and m are the length of two array
    { 
                  
        if (a[i] > b[j])  
        { 
            j++; 
        }  
                  
        else
        if (b[j] > a[i])  
        { 
            i++; 
        }  
        else
        { 
            // when both are equal 
            System.out.print(a[i] + " "); 
            i++; 
            j++; 
        } 
    } */

}
