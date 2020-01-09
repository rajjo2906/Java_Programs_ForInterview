package StringProgramAndArrays;

public class UppernLowerCaseLetter {
	
		public static void main(String args[]) {
			
			//program to print string having letters arranged in upper and lower case just adjacent to each other keeping first letter
			//intact.
			
			String s = "ahJnAjNo";
			
			char[] ch = s.toCharArray();
			String temp = " ";
			
			
			
			
			for(int i=0; i<ch.length;i++) {
				
				if(temp.indexOf(ch[i])== -1) {
			
				temp = temp + ch[i];
				}
				
				int asciiValue = (int)ch[i];
			
				
				if(asciiValue>=65 && asciiValue <=90) {
					
					asciiValue = asciiValue + 32;
					
					
					for(int j=i+1; j<ch.length;j++) {
						
						
						if(ch[j] == (char)asciiValue) {
							
							
							temp = temp + Character.toString(ch[j]);
							
							
						}
					}
					
				}
				
				else if (asciiValue >= 97 && asciiValue <=122 ) {

				asciiValue = asciiValue - 32;

				for (int j = i + 1; j < ch.length; j++) {
					if (ch[j] == (char) asciiValue) {
						

						temp = temp + Character.toString(ch[j]);

					}
				}

			}
			}
			
			System.out.println(temp);
			
	}
}