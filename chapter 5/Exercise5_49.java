// Sky Nicholls
// 1-6-20

import java.util.Scanner;
class Exercise5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String l = input.next();
		
		int vowelCount = 0;
		int consonantsCount = 0;
		int whatever = 0;
		
		l = l.toUpperCase();
		
		while(whatever < l.length()){
		if(l.charAt(whatever) == 'A'|| l.charAt(whatever) == 'E' || l.charAt(whatever) == 'I'|| l.charAt(whatever) == 'O' || l.charAt(whatever) == 'U'){
			
			vowelCount++;
		}
		else{
		consonantsCount++;
	}
		whatever++;
}
		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of consonants: " + consonantsCount);

	}
}