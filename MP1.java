import java.util.Scanner;

public class MP1 {

	public static void main(String[] args) {
//		Scanner myScanner = new Scanner(System.in);
//
//		System.out.println("Guess a number between 0 and 100:");
//		int number = myScanner.nextInt();
//		myScanner.nextLine();

		int number = 0;
		int rand = random();

//		myScanner.close();

		while (true) {
			checkNumber(number, rand);
		}

	}

	static int checkNumber(int number, int rand) {
		int count = 1;
		Scanner myScanner = new Scanner(System.in);
		rand = random();
		System.out.println("Guess a number between 0 and 100:");
		number = myScanner.nextInt();
		myScanner.nextLine();
		
		do {
			
			if (number < rand) {
				System.out.println("Number to low, guess higher!");
				number = myScanner.nextInt();
				myScanner.nextLine();
				count++;
			} 
			else if (number > rand) {
				System.out.println("Number to high, guess lower!");
				number = myScanner.nextInt();
				myScanner.nextLine();
				count++;
			}
		} while (number != rand);

		System.out.println("Your guess was right! You had " + count + " guesses.");

//			myScanner.close();

		return rand;
	}

	static int random() {

		double rand = Math.random();

		double randDTen = rand * 100;

		int round = (int) Math.round(randDTen);
//		System.out.println("Random " + round);

		return round;
	}
}
