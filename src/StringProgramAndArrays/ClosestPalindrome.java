package StringProgramAndArrays;

public class ClosestPalindrome {
		
			
			boolean palindrome(int n) {

				int sum = 0;
				int temp = n;
				
				while(n>0) {
					int r = n%10;
					sum = sum*10 + r;
					n = n/10;
				}
				
				if(sum==temp) {
		
					return true;
				}
				
				else 
					return false;			
			}
			
			public void findclosesPalindrome(int num) {
				
				int gp = 0;
				int lp = 0;
				
				for(int i=num;;i++) {
					
					if(this.palindrome(i) == true) {
					
						gp = i;
						break;
					}
				}
				
				for (int j = num-1;; j--) {
		
					if (this.palindrome(j) == true) {
						
						lp = j;
						break;
					}
				}
				
				if(Math.abs(gp-num)> Math.abs(num-lp)) {
					
					System.out.println("Closest Palindrome is:" + " " + lp);
					
				}
				
				else if (Math.abs(gp-num)<= Math.abs(num-lp)) {
					System.out.println("Closest Palindrome is:" + " " + gp);
				}
					
					
				
				
			}
			
			public static void main(String args[]) {
				
				UppernLowerCaseLetter obj = new UppernLowerCaseLetter();
				obj.findclosesPalindrome(739);
			}
			
			
			
		}
