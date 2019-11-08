
import java.util.Scanner;
class Exercise4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length from the center to the vertex: ");
		double r = input.nextDouble();
		
		double s =  Math.sin(Math.PI / 5) * (2 * r);	
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.printf("The area of the pentagon is %5.2f\n", area);
		
		
	}
}