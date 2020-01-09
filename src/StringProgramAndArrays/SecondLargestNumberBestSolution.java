package StringProgramAndArrays;

public class SecondLargestNumberBestSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//second largest number with minimum comparison and for loop
		
		int [] a = new int[]{2,3,5,3,1,8,5,12};
		
		int largest = Integer.MIN_VALUE;  //-2^31
		int second_largest = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>largest) {
				
				second_largest = largest;
				largest = a[i];		
			}
			
			else if(a[i]>second_largest && a[i]!=largest)
			{
				second_largest = a[i];
			}
		}
		
		System.out.println(second_largest);
		
		
		//second min value
		
/*		int[] a = new int[] { 2, 3, 5, 3, 1, 8, 5, 12 };

		int largest = Integer.MAX_VALUE;  //2^31
		int second_largest = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] < largest) {

				second_largest = largest;
				largest = a[i];
			}

			else if (a[i] < second_largest && a[i] != largest) {
				second_largest = a[i];
			}
		}

		System.out.println(second_largest);*/


	}

}
