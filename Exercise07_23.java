//Sky Nicholls
//3-20-20

public class Exercise07_23 {
	public static void main(String[] args) {
		final int NUMBER_OF_LOCKER = 100;

		boolean[] lockers = new boolean[NUMBER_OF_LOCKER];
		
		for (int j = 1; j <= NUMBER_OF_LOCKER; j++) {
	 
			for (int i = j - 1; i < NUMBER_OF_LOCKER; i += j) {
				lockers[i] = !lockers[i];
			}
		}


		for (int i = 0; i < NUMBER_OF_LOCKER; i++) {
			if (lockers[i])
				System.out.println("Locker " + (i + 1) + " is open");
		}
	}
}
