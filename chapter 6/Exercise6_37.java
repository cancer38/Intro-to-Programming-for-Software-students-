import java.util.Scanner;
class Exercise6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
			int number = input.nextInt();
		System.out.print("Enter a width: ");	
		int width = input.nextInt();
		
		System.out.println(
					number + " formatted to width " + width + ": " + format(number, width));
			}

			public static String format(int number, int width) {
				String num = number + ""; 
				
				if (num.length() < width) {
					for (int k = width - num.length(); k > 0; k--) {
						num = 0 + num;
					}
				}
				return num;
	}
}