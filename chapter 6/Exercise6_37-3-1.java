/*Sky Nicholls
//1-16-20 
this is to show how to format a integer.*/



import java.util.Scanner;
 class Exercise6_37 {
	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number & width: ");
			int numbers = input.nextInt();
			int width = input.nextInt();
				
			String nums = numbers + ""; 
			System.out.println(numbers + " formatted to width " + width + ": " + format(numbers, width));
		
		}
		
	public static String format(int number, int width){	
		String nums = number + ""; 
			if (nums.length() < width) {
			for (int k = width - nums.length(); k > 0; k--) {
				nums = 0 + nums;
				return nums;
	}
}