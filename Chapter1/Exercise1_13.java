// Skylynn Nicholls
// CSCI 1105
// Exercise 1-13

public class Exercise1_13 {
	public static void main(String[] args) {
		double a = 3.4;
			double b = 50.2;
			double c = 2.1;
			double d = 0.55;
			double e = 44.5;
			double f = 5.9;

			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);

			System.out.println("x = " +(44.5 * 0.55 - 50.2 * 5.9)/(3.4 * 0.55 - 50.2 * 2.1));
			System.out.println(" y = " + (3.4 * 5.9 - 44.5 * 2.1)/(3.4 * 0.55 - 50.2 * 2.1));
	}
}