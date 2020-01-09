package StringProgramAndArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GivenNumberClosestinArray {
	
	//add the given number to the arraylist (as in this case its 0)
	//sort the array
	//number adjacent to given number are closer. (in this case -6 and 2 are adjacent to 0 so they are closer )

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { -12, -6, -8, 2, 3, 5, 6, 8, 6 };

		List<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}

		arr.add(0);

		Collections.sort(arr);
		System.out.println(arr);

	}

}
