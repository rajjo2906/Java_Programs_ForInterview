package StringProgramAndArrays;

import java.util.Scanner;

public class RotateMatrix90degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[3][3];
		
		System.out.println("Enter the elements");
		
		Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					
					a[i][j] = sc.nextInt();
				}
			}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Rotated 90 degree matrix is ---->");
		for(int i=0; i<3;i++) {
			
			for (int j = 2; j >=0; j--) {

				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}

	}

}
