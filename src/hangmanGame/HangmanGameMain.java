package hangmanGame;

import java.util.Scanner;

public class HangmanGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HangmanClass game = new HangmanClass();

		game.cratingGuessingString();
		while ((game.wrong < 6 && !game.convertingGuessingArrayIntoString())) {
			System.out.println("Please enter guess");
			char guessedLetter = sc.next().charAt(0);

			game.changingStarsIntoInputChar(guessedLetter);

		}
		if (game.convertingGuessingArrayIntoString()) {
			System.out.println("You Won");
		} else if (game.wrong > 5) {
			System.out.println("You Loose");

		}

	}

}
