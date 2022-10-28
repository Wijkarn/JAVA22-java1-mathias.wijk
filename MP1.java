import java.util.Scanner;

public class MP1 {

	public static void main(String[] args) {
		
		while (true) {
			checkNumber();
		}

	}

	static void checkNumber() {
		int number;
		int count = 1;
		Scanner myScanner = new Scanner(System.in);
		int rand = random();
		System.out.println("Guess a number between 0 and 100:");
		number = myScanner.nextInt();
		myScanner.nextLine();
		
		while (number != rand) {
			
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
		}

		System.out.println("Your guess was right! You had " + count + " guesses.");

	}

	static int random() {

		double rand = Math.random();

		double randDTen = rand * 100;

		int round = (int) Math.round(randDTen);
		System.out.println("Random " + round);

		return round;
	}
}
