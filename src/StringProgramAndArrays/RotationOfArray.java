package StringProgramAndArrays;

public class RotationOfArray {
	public static void main (String args[]) {
		
		int k = 5;
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


}
