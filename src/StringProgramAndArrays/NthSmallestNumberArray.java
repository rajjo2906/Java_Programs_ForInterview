package StringProgramAndArrays;

public class NthSmallestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[]{7,10,3,20,15};
		int temp = 0;
		int k = 2;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i] > a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}		
				
			}
			
			if(i == k-1) {
				System.out.println(a[i]);
				break;
			}
		}

	}

}
