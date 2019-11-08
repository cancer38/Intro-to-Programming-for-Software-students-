// Sky Nicholls
// CSCI 1105
// Exercise3_3

import java.util.Scanner;
public class Exercise3_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" a, b, c, d, e, f: ");
		
		int  a = input.nextInt();
		int  b = input.nextInt();
		int  c = input.nextInt();
		int  d = input.nextInt();
		int  e = input.nextInt();
		int  f = input.nextInt();
		
		if((a*d - b*c) == 0){
			System.out.print("This can not be sloved");
		}
		else{
			double x = ((a * f) - (e * c)) / ((a * d) - (b * c));
			double y = ((e * d) - (b * f)) / ((a * d) - (b * c));

			System.out.printf("x is %.1f and y id %.1f", x, y);
		}	
		
	}
}