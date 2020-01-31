import java.util.Scanner;
class Exercise6_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int number = input.nextInt();
		System.out.println(number + (isPalindrome(number)? "is" : "is not") + "a palindrome.");
	}
	
	public static boolean isPalindrome(int number){
		if(number == reverse(number))
		return true;
		return false;
	}
	
	public static int reverse(int number){
		String reverse = "";
		String n = number + "";
		for(int i = n.length()- 1; i >= 0; i--){
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);
		
		
		
	}
}