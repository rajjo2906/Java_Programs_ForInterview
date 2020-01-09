package DataStructure_Programs;

/*
 * this is the worst case scenario
Notes: Time Complexity O(m+n), m= number of element present in array 1 i.e a[];
 							   n= number of element present in array 2 i.e b[];
 							   
Algo:

 if a[i] is smaller than b[j], print a[i](smaller) and increase i(i++)
 else if b[j] is smaller than a[i], print b[j] (smaller) and increase j(j++)
 
  else both are equal , print anyone and increase both i and j (i++,j++)
  
  then print remaining element from larger array
 */

public class UnionofTwoArray_WorstCaseScenario {
	
	//int[] union = new int[m+n];
	
	public static void main (String[] args) {

		int i=0;
		int j=0;
		
		int[] a = new int[]{1,4,8,9,11,24};
		int[] b = new int[]{2,4,6,8,14,17,19,23};
		
		int m = a.length;
		int n = b.length;
		
		// TODO Auto-generated method stub
	
	while(m>i && n>j) {
		
		if(a[i]<b[j]) {
			
			System.out.println(a[i]);
			
			i++;
		}
		else if(a[i]>b[j]) {
			
			System.out.println(b[j]);
			
			j++;
		}
		
		else {
			System.out.println(b[j]);
			i++;j++;
		}
		}
	
	while (m>i) {
		System.out.println(a[i]);
		i++;
	}
	while(n>j) {
		System.out.println(a[j]);
		j++;
	}
	}
}
