 class Exercise5_11 {
	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;	
		int count = 0; 

		for (int j = 100; j <= 200; j++) {
			if (j % 5 == 0 ^ j % 6 == 0) {
				count++;
				if (count % NUMBERS_PER_LINE == 0)
					System.out.println(j);
				else
					System.out.print(j + " ");			
			}
		}
		System.out.println();
	}
}
