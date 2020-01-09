package DataStructure_Programs;

/*
 One more method is present in https://javaconceptoftheday.com/find-union-and-intersection-of-multiple-arrays-in-java/
 for both intersection and union
 */

//Method 1
import java.util.HashSet;
import java.util.Set;

public class UnionofarrayUsingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a = new int[]{1,4,8,9,11,24};
		int[] b = new int[]{2,4,6,8,14,17,19,23};
		
		Set<Integer> se = new HashSet<Integer>();
		
		for(int i=0; i< a.length; i++) {
			se.add(a[i]);
			}
		
	for(int j=0; j< b.length; j++) {
			se.add(b[j]);
		}
		
		for(int un: se) {
			System.out.println(un);
		}
		


	}

}
