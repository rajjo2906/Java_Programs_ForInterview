package StringProgramAndArrays;

public class FirstNegativeIntegerWindowSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k/0
		int[] a = new int[]{-8,2,3,-6,10};
		
		int k = 2;
		
		
		for(int i=0; i<a.length-k+1;i++) {
			boolean flag = false;
			for(int j=i; j<i+k ;j++) {
				
				if(a[j]<0) {
					System.out.print(a[j] + " ");
					flag = true;
					break;
				}
				
			}
			
			if(flag == false) {
				System.out.print(0 + " ");
			}
			
		}

	}

}
