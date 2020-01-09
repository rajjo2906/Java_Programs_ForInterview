package StringProgramAndArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Numberofoccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method 1
		
		//String s = "rajat is a rajat good boy good is"; //occurenece for string
		
//		Map<String,Integer> mp = new HashMap<String,Integer>();
//		
//		String [] str = s.split(" ");
//		
//		for(String str1: str ) {
//			
//			if(mp.get(str1)!=null) {
//				
//				mp.put(str1, mp.get(str1)+1);
//			}
//			
//			else {
//				mp.put(str1, 1);
//			}
//			
//		}
////		System.out.println(mp);
//		
//		Set<String> se = mp.keySet();
//		
//		for(String ke: se) {
//				
//				System.out.println("the word " + ke + " appears " + mp.get(ke));
//			}
		
		int [] a = new int[]{1,1,2,3,2,4,3,5,2,6,7,6,5,8,7,8}; //occurence for numbers
		
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<a.length; i++) {
			
			
			if(mp.get(a[i])!=null) {
				mp.put(a[i], mp.get(a[i])+1);
			}
			else
			mp.put(a[i], 1);
		}

		System.out.println(mp);
	}
	
	//Method 2
	
	int count = 1;
	int [] a = new int[]{1,2,3,1,2,4,5,6,2,5,4};
	int [] temp = new int[a.length];
	
	for(int i = 0; i<temp.length; i++) {
		temp[i] = -1;
	}
	
	for(int i = 0; i<a.length; i++) {
		
		for(int j = i+1; j<a.length; j++) {
			
			if(a[i] == a[j]) {
				
				temp[j] = 0;
				
				count++;
			}
		}
		
		if (temp[i]!=0) {
		System.out.println(a[i] + " " + "is occurring " + count + " " + "times");
		}
		count =1;

}
