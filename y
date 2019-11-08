
import java.util.Scanner;
class Exercise3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 edges: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		input.close();
		
		if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			System.out.print("The perimeter is: " + (side1 + side2 + side3));
		}
		else{
			System.out.print("This is invalid");
			System.exit(0);
		}
	}
}
