//Sky Nicholls
//1-16-20

import java.util.Scanner;
	 class Exercise_06_17 {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in); 
			System.out.print("Enter n: ");
			int n = input.nextInt();
			printMatrix(n);
		}
		public static void printMatrix(int n) {
		for(int x = 0; x < n; x++) {
			for(int f = 0; f < n; f++) {
				System.out.print((int)(Math.random() * 2));
			}
			System.out.println();
		}
	}
}		
