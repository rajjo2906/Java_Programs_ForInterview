package StringProgramAndArrays;

public class ReplaceNextLargestNumber {

	//https://practice.geeksforgeeks.org/problems/greater-on-right-side/0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[]{10,3,1,9};

		for(int i=0; i<a.length-1; i++) {
			
			int max = a[i+1];
			
			for(int j = i+1; j<a.length; j++) {
				
				if(a[j]>max) {
					max = a[j];
				}
				
			}
			
			a[i] = max;
			}
		
		a[a.length-1]  = -1;
			

		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
