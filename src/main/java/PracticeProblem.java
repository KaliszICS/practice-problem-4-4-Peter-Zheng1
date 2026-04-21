/**

        * File: Lesson 4.4

        * Author: Peter

        * Date Created: April 21, 2026

        * Date Last Modified: April 21, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static boolean hasCapital(String word){
		
		for(int s = 0; s < word.length(); s++) {
			if (Character.isUpperCase(word.charAt(s))) {
				return true;
			}
		}
		return false;
	}

	public static boolean isPrime(int num) {
		
		if (num <= 1) {
			return false;
		}
		
		for (int s = 2; s < num; s++) {
			if (num % s == 0){
				return false;
			}
		}

		return true;
	}

	
}
