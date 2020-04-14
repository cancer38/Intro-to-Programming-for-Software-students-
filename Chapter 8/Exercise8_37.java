//Sky Nicholls
// 03-12-20

import java.util.Scanner;

class Exercise8_37 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int correctCount = 0;
	for (int s = 0; s < stateCapitals.length; s++) {
		System.out.print("What is the capital of " + stateCapitals[s][0]+"? ");
		String f = input.nextLine();
	if (f.equalsIgnoreCase(stateCapitals[s][1])) {
		System.out.println("You're correct!");
		correctCount++;
} else {
		System.out.println("The correct answer should be " + stateCapitals[s][1]);
		}
	}
		System.out.println("The correct count is " + correctCount);
}

	public static String[][] stateCapitals = {
						{"Arizona", "Phoenix"},
						{"Arkansas", "Little Rock"},
						{"California", "Sacramento"},
						{"Colorado", "Denver"},
						{"Hawaii", "Honolulu"},
						{"Idaho", "Boise"},
						{"North Dakota", "Bismark"},
						{"Nevada", "Carson City"},
						{"Missouri", "Jefferson City"},
						{"Texas", "Austin"},
						{"Utah", "Salt Lake City"},
						
				};
	}