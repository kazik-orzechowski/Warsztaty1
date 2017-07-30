package Dice_Pocker_Probability;

import java.util.Arrays;

public class Dice_Iteration {

		
	static String pairIterator() {
		int iter = 0;
		int[] result = new int[5];
		while (true) {
			iter++;
			result = Dice_Main.fiveDices();
			if (Dice_Main.pair(result).substring(0, 1).equals("1")) {
				break;
			}
		}
		return "Liczba iteracji: " + iter + "  Wynik rzutu: " + Arrays.toString(result) + ". Mamy parę!";
	}

	static String twoPairIterator() {
		int iter = 0;
		int[] result = new int[5];
		while (true) {
			iter++;
			result = Dice_Main.fiveDices();
			if (Dice_Main.twoPairs(result).substring(0, 1).equals("1")) {
				break;
			}
		}
		return "Liczba iteracji: " + iter + "  Wynik rzutu: " + Arrays.toString(result) + ". Mamy dwie pary!";
	}

	static String smallStreetIterator() {
		int iter = 0;
		int[] result = new int[5];
		while (true) {
			iter++;
			result = Dice_Main.fiveDices();
			if (Dice_Main.smallStreet(result).substring(0, 1).equals("1")) {
				break;
			}
		}
		return "Liczba iteracji: " + iter + "  Wynik rzutu: " + Arrays.toString(result) + ". Mamy małego street'a";
	}

	static String largeStreetIterator() {
		int iter = 0;

		int[] result = new int[5];
		while (true) {
			iter++;
			result = Dice_Main.fiveDices();
			if (Dice_Main.largeStreet(result).substring(0, 1).equals("1")) {
				break;
			}
		}
		return "Liczba iteracji: " + iter + "  Wynik rzutu: " + Arrays.toString(result) + ". Mamy dużego street'a";
	}

	static String fullIterator() {
		int iter = 0;

		int[] result = new int[5];
		while (true) {
			iter++;
			result = Dice_Main.fiveDices();
			if (Dice_Main.full(result).substring(0, 1).equals("1")) {
				break;
			}
		}
		return "Liczba iteracji: " + iter + "  Wynik rzutu: " + Arrays.toString(result) + ". Mamy full'a";
	}

	static String fourKindIterator() {
		int iter = 0;

		int[] result = new int[5];
		while (true) {
			iter++;
			result = Dice_Main.fiveDices();
			if (Dice_Main.fourKind(result).substring(0, 1).equals("1")) {
				break;
			}
		}
		return "Liczba iteracji: " + iter + "  Wynik rzutu: " + Arrays.toString(result)+ ". To jest kareta!";
	}

	static String threeKindIterator() {
		int iter = 0;

		int[] result = new int[5];
		while (true) {
			iter++;
			result = Dice_Main.fiveDices();
			if (Dice_Main.threeKind(result).substring(0, 1).equals("1")) {
				break;
			}
		}
		return "Liczba iteracji: " + iter + "  Wynik rzutu: " + Arrays.toString(result) + ". Czyżby trójka?";
	}

	static String pockerIterator() {
		int iter = 0;

		int[] result = new int[5];
		while (true) {
			iter++;
			result = Dice_Main.fiveDices();
			if (Dice_Main.pocker(result).substring(0, 1).equals("1")) {
				break;
			}
		}
		return "Liczba iteracji: " + iter + "  Wynik rzutu: " + Arrays.toString(result) + ". POOOKEEEER!!!";
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Pair: " + pairIterator());
		 System.out.println("Two pair: " + twoPairIterator());
		 System.out.println("Small street: " + smallStreetIterator());
		 System.out.println("Big street: " + largeStreetIterator());
		 System.out.println("Full: " + fullIterator());
		 System.out.println("Three of a kind: " + threeKindIterator());
		 System.out.println("Four of a kind: " + fourKindIterator());
		 System.out.println("Pocker: " + pockerIterator());
		
		
	}

}
