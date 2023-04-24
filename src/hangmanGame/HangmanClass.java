package hangmanGame;

import java.io.CharArrayReader;
import java.util.Random;

public class HangmanClass {
	int lengthOfName = 0;
	int wrong = 0;
	String nameList[] = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Suchitra", "Vindhuja" };

	String pickingRendomWord() {
		Random randomWord = new Random();
		String randomName = nameList[randomWord.nextInt(nameList.length)];
		System.out.println(randomName);
		lengthOfName = randomName.length();
		return randomName;
	}

	String pickedName = pickingRendomWord();
	char pickedNameArray[] = pickedName.toCharArray();
	char[] guessingArray = new char[pickedNameArray.length];

	void cratingGuessingString() {
		for (int i = 0; i < guessingArray.length; i++) {
			guessingArray[i] = '*';
		}
		System.out.println(guessingArray);
	}

	void changingStarsIntoInputChar(char inputChar) {
		if (!pickedName.contains(String.valueOf(inputChar))) {
			wrong++;

		}

		for (int i = 0; i < pickedNameArray.length; i++) {

			if (pickedNameArray[i] == inputChar) {
				guessingArray[i] = inputChar;

			}
		}
		System.out.println(guessingArray);
		System.out.println("You have guessed (" + wrong + ") wrong letters");
	}

	boolean convertingGuessingArrayIntoString() {
		String str = String.valueOf(guessingArray);
		if (pickedName.equals(str)) {
			return true;
		}
		return false;
	}

}
