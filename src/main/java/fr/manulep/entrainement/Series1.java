package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	public static String helloWorld(String name) {
		// 1
		if (name != null && name != "")
			return "Hello " + name;
		else
			return "Hello World";
	}

	public static String[] removeNullElements(String[] array) {
		// 2
		ArrayList<String> list = new ArrayList<String>();

		for (int j = 0; j < array.length; j++) {
			if (array[j] != null) {
				list.add(array[j]);
			}
		}

		String[] results = list.toArray(new String[0]);

		return results;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		int[] stockage = new int[1];
		int[] result = new int[array.length + stockage.length];

		stockage[0] = element;
		System.arraycopy(stockage, 0, result, 0, 1);
		System.arraycopy(array, 0, result, 1, array.length);

		return result;
	}

	public static int[] allElementsExceptFirstThree(int[] array) {
		// 4
		int[] result;
		if (array.length > 3) {
			result = new int[array.length - 3];
			System.arraycopy(array, 3, result, 0, result.length);
		} else {
			result = new int[0];
		}
		return result; //
	}

	public static String getFirstHalf(String word) {
		// 5
		int length = word.length();
		double halfLength = length / 2.0;
		int rounded = (int) Math.ceil(halfLength);
		String half = word.substring(0, rounded);
		return half;
	}

	public static String[] selectElementsStartingWithA(String[] array) {
		// 6

		ArrayList<String> list = new ArrayList<String>();

		for (int j = 0; j < array.length; j++) {
			if (array[j].charAt(0) == 'a') {
				list.add(array[j]);
			}
		}

		return list.toArray(new String[0]);
	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7
		String[] vow = { "a", "e", "i", "o", "u", "y" };
		List<String> vowList = Arrays.asList(vow);

		ArrayList<String> results = new ArrayList<String>();

		for (int j = 0; j < array.length; j++) {
			String word = array[j];
			if (word != null) {
				String firstletter = word.substring(0, 1);
				if (vowList.contains(firstletter)) {
					results.add(word);
				}
			}

		}

		return results.toArray(new String[0]);

	}

	public static String[] reverseOrderInArray(String[] array) {
		// 8
		System.out.println("coucou");
		String[] reversed = new String[array.length];

		for (int i = 0; i < array.length; i++) {
			reversed[i] = array[array.length - i - 1];
		}
		return reversed;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9
		int length = array.length;
		int rounded = (int) Math.round(length / 2);

		int[] result = new int[array.length + 1];
		System.arraycopy(array, 0, result, 0, rounded);
		result[rounded] = element;
		System.arraycopy(array, rounded, result, rounded + 1, array.length - rounded);

		return result;
	}

	public static String shortestWord(String text) {
		// 10
		String[] mots = text.split(" ");
		int shortestLength = mots[0].length();
		String bestWord = mots[0];
		for (String mot : mots) {
			if (mot.length() < shortestLength) {
				shortestLength = mot.length();
				bestWord = mot;
			}
		}
		return bestWord;
	}

	public static String removeCapitals(String text) {
		// 11
		String[] letters = text.split("");
		String resultString = "";
		for (int i = 0; i < letters.length; i++) {
			String letter = letters[i];
			boolean isSpace = (" ".equals(letter));
			boolean isCapital = (letter.toUpperCase() != letter);

			if (isSpace || isCapital) {
				resultString += letter;
			}
		}

		return resultString;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		// 12
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		// 13
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		// 14
		int sum = 0;
		for (Integer integer : numbers) {
			sum += integer;
		}
		return sum;
	}

	public static float makeNegative(float number) {
		// 15
		if (number < 0)
			return number;
		else
			return 0 - number;
	}

	public static boolean checkForSpecialCharacters(String string) {
		// 16
		Pattern p = Pattern.compile("[^a-z0-9! ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(string);
		boolean hasOne = m.find();
		return hasOne;
	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17
		String[] vow = { "a", "e", "i", "o", "u", "y" };
		List<String> vowList = Arrays.asList(vow);
		if (word != null) {
			String firstletter = word.substring(0, 1).toLowerCase();
			return !vowList.contains(firstletter);
		} else
			return false;
	}

	public static String getDomainName(String email) {
		// 18
		System.out.println(email);
		String[] list = email.split("@");
		String[] domain = list[1].split(".com");
		return domain[0];
	}

	public static int[] letterPosition(String name) {
		// 19
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		List<String> alphaList = Arrays.asList(alphabet);

		String[] list = name.split("");
		int[] positions = new int[list.length];

		for (int i = 0; i < list.length; i++) {
			String letter = list[i].toLowerCase();
			positions[i] = alphaList.indexOf(letter) + 1;
		}
		return positions;
	}

	public static boolean isPeer(int number) {
		// 20
		return (number % 2 == 0);
	}

}
