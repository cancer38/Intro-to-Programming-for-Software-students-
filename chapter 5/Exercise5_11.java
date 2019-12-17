class Exercise5_11 {
	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 10;
		int count = 0;
		
		for(int k = 100; k <= 200; k++){
			if(k % 5 == 0 ^ k % 6 == 0){
				count++;
				System.out.print(k + " ");
			}
			if(NUMBER_PER_LINE == count){
				System.out.println();
				count = 0;
			}
		}	
	}
}