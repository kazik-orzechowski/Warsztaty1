package Dice_Pocker_Probability;

import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Dice_Main {
	static int totalValue = 0;
	static int throwValue = 0;
	static int[] table;

	static int dice() {
		Random generator = new Random();
		int oneDiceThrow = generator.nextInt(6);
		return oneDiceThrow + 1;
	}

	static int[] fiveDices() {
		int[] fullThrow = new int[5];
		for (int i = 0; i < 5; i++) {
			fullThrow[i] = dice();
		}
		Arrays.sort(fullThrow);
		return fullThrow;
	}

	static void print(int[] newSet) {
		System.out.println(Arrays.toString(newSet));
	}

	static String pair(int[] inThrow) {
		int ifSuccess = 0;
		int i;
		for (i = 0; i < 4; i++) {
			if (inThrow[i] == inThrow[i + 1]) {
				ifSuccess = 1;
				break;
			}
		}
		totalValue = inThrow[i] * 2;
		return ifSuccess + Arrays.toString(inThrow) + " Suma oczek: " + totalValue;
	}

	static String twoPairs(int[] inThrow) {
		int ifSuccess = 0;
		for (int i = 0; i < 2; i++) {
			if ((inThrow[i] == inThrow[i + 1]) && (inThrow[i + 2] == inThrow[i + 3])) {
				totalValue = inThrow[i] * 2 + inThrow[i] * 2;
				ifSuccess = 1;
				break;
			} else if ((inThrow[0] == inThrow[1]) && (inThrow[3] == inThrow[4])) {
				totalValue = inThrow[0] * 2 + inThrow[4] * 2;
				ifSuccess = 1;
				break;
			}
		}
		return ifSuccess + Arrays.toString(inThrow) + " Suma oczek: " + totalValue;
	}

	static String smallStreet(int[] inThrow) {
		int ifSuccess = 0;
		for (int i = 0; i < 5; i++) {
			if (inThrow[i] == i + 1) {
				ifSuccess++;
			}
		}
		if (ifSuccess == 5) {
			ifSuccess = 1;
		} else {
			ifSuccess = 0;
		}
		totalValue = 15;
		return ifSuccess + Arrays.toString(inThrow) + " Suma oczek: " + totalValue;
	}

	static String largeStreet(int[] inThrow) {
		int ifSuccess = 0;
		for (int i = 0; i < 5; i++) {
			if (inThrow[i] == i + 2) {
				ifSuccess++;
			}
		}
		if (ifSuccess == 5) {
			ifSuccess = 1;
		} else {
			ifSuccess = 0;
		}
		totalValue = 20;
		return ifSuccess + Arrays.toString(inThrow) + " Suma oczek: " + totalValue;
	}

	static String fourKind(int[] inThrow) {
		int ifSuccess = 0;
		for (int i = 0; i < 2; i++) {
			if ((inThrow[i] == inThrow[i + 1]) && (inThrow[i + 1] == inThrow[i + 2])
					&& (inThrow[i + 3] == inThrow[i + 2])) {
				ifSuccess = 1;
			}
		}
		totalValue = inThrow[2] * 4;
		return ifSuccess + Arrays.toString(inThrow) + " Suma oczek: " + totalValue;
	}

	static String threeKind(int[] inThrow) {
		int ifSuccess = 0;
		for (int i = 0; i < 3; i++) {
			if ((inThrow[i] == inThrow[i + 1]) && (inThrow[i + 1] == inThrow[i + 2])) {
				ifSuccess = 1;
			}
		}
		if (ifSuccess == 1) {
			ifSuccess = 1;
		} else {
			ifSuccess = 0;
		}
		totalValue = inThrow[2] * 3;
		return ifSuccess + Arrays.toString(inThrow) + " Suma oczek: " + totalValue;
	}

	static String full(int[] inThrow) {
		int ifSuccess = 0;

		if (((inThrow[0] == inThrow[1]) && (inThrow[2] == inThrow[3])) && ((inThrow[3] == inThrow[4]))
				|| ((inThrow[1] == inThrow[2]) && (inThrow[2] == inThrow[0])) && ((inThrow[4] == inThrow[3]))) {
			ifSuccess = 1;
		}
		totalValue = 0;
		for (int j = 0; j < 5; j++) {
			totalValue += inThrow[j];
		}
		return ifSuccess + Arrays.toString(inThrow) + " Suma oczek: " + totalValue;
	}

	static String pocker(int[] inThrow) {
		int ifSuccess = 0;
		for (int i = 0; i < 1; i++) {
			if ((inThrow[i] == inThrow[i + 1]) && (inThrow[i + 1] == inThrow[i + 2])
					&& (inThrow[i + 3] == inThrow[i + 2]) && (inThrow[i + 3] == inThrow[i + 4])) {
				ifSuccess = 1;
			}
		}
		totalValue = inThrow[0] * 5;
		return ifSuccess + Arrays.toString(inThrow) + " Suma oczek: " + totalValue;
	}

	//

	static int[] goodEqualDices(int[] inThrow, int nrOfGood, int goodNumber1) {

		for (int i = 0; i < nrOfGood; i++) {
			inThrow[i] = goodNumber1;
		}
		for (int j = nrOfGood; j < 5; j++) {
			inThrow[j] = dice();
		}
		Arrays.sort(inThrow);
		return inThrow;
	}

	static int[] fourGoodEqual(int[] inThrow) {
		int goodNumber = inThrow[2];
		int nrOfGood = 4;
		goodEqualDices(inThrow, nrOfGood, goodNumber);

		return inThrow;
	}

	static int[] threeGood(int[] inThrow) {
		int goodNumber = inThrow[2];
		int nrOfGood = 3;
		goodEqualDices(inThrow, nrOfGood, goodNumber);

		return inThrow;
	}

	static int[] twoGood(int[] inThrow) {
		int goodNumber = 0;
		if (inThrow[1] == inThrow[0] || inThrow[1] == inThrow[2]) {
			goodNumber = inThrow[1];
		} else if (inThrow[2] == inThrow[3] || inThrow[3] == inThrow[4]) {
			goodNumber = inThrow[3];
		}
		int nrOfGood = 2;
		goodEqualDices(inThrow, nrOfGood, goodNumber);
		return inThrow;
	}

	static int[] oneGood(int[] inThrow) {
		int goodNumber = 0;
		int nrOfGood;
		if (inThrow[4] == 5 || inThrow[4] == 6) {
			goodNumber = inThrow[4];
			nrOfGood = 1;
		} else {
			goodNumber = inThrow[0];
			nrOfGood = 0;
		}
		goodEqualDices(inThrow, nrOfGood, goodNumber);
		return inThrow;
	}

	static int[] fourGoodDifferent(int[] inThrow) {
		if (inThrow[0] == inThrow[1] && inThrow[2] == inThrow[3]) {
			inThrow[4] = dice();
		} else if (inThrow[0] == inThrow[1] && inThrow[4] == inThrow[3]) {
			inThrow[2] = dice();
		} else {
			inThrow[0] = dice();
		}
		Arrays.sort(inThrow);
		return inThrow;
	}

	public static void printTable(int[][] mainTable, String[] playersNames, String heading) {
		String[] firstColumn = { "    | ", "SZ  | ", "1P  | ", "2P  | ", "MS  | ", "DS  | ", "3   | ", "F   | ",
				"K   | ", "P   | ", "Suma| " };

		System.out.println("\n" + heading + "\n");

		for (int i = 0; i < mainTable.length + 1; i++) {
			String row = firstColumn[i];
			for (int j = 0; j < mainTable[1].length; j++) {
				if (i == 0) {
					row += playersNames[j];
					for (int k = 0; k < 8 - playersNames[j].length(); k++) {
						row += " ";
					}

				} else if (i < 10) {
					String value;
					if (mainTable[i - 1][j] >= 0) {
						value = "" + mainTable[i - 1][j];
					} else {
						value = "--";
					}
					row += value;
					for (int l = 0; l < 8 - value.length(); l++) {
						row += " ";
					}
				} else {
					int sum = 0;
					for (int m = 0; m < 9; m++) {
						if (mainTable[m][j] > 0) {
							sum += mainTable[m][j];
						}
					}
					row += sum;
					for (int l = 0; l < 8 - Integer.toString(sum).length(); l++) {
						row += " ";

					}

				}
				row += " | ";
			}
			System.out.println(row);

		}

	}

	static int cancelPosition(int[][] mainTable, int playerNumber) {
		int[] cancelOrder = { 8, 7, 3, 4, 6, 1, 5, 2, 0 }; // kolejność wykreślania
		int canceledPosition = 0;
		for (int i = 0; i < cancelOrder.length; i++) {
			if (mainTable[i][playerNumber] == 0) {
				canceledPosition = i;
				break;
			}
		}
		return canceledPosition;
	}

	static int[] throwXTimes(int throwNumber, int[][] mainTable, int playerNumber) {
		int[] outcome = new int[2];
		int[] result = new int[5];
		result = fiveDices();
		String resultName = " ";
		for (int i = 0; i < throwNumber; i++) {
			System.out.print("Rzuciliśmy " + (i + 1) + " raz i otrzymaliśmy :");
			print(result);
			if (mainTable[8][playerNumber] == 0 && pocker(result).substring(0, 1).equals("1")) {
				throwValue = Integer.parseInt(pocker(result).substring(29));
				resultName = "8POOKEEER!!!";
				break;
			}
			if (mainTable[7][playerNumber] == 0 && fourKind(result).substring(0, 1).equals("1")) {
				throwValue = Integer.parseInt(fourKind(result).substring(29));
				result = fourGoodEqual(result);
				resultName = "7Kareta!";
				continue;
			}
			if (mainTable[6][playerNumber] == 0 && full(result).substring(0, 1).equals("1")) {
				throwValue = Integer.parseInt(full(result).substring(29));
				resultName = "6Mamy Fulla";
				break;
			}
			if (mainTable[3][playerNumber] == 0 && smallStreet(result).substring(0, 1).equals("1")) {
				throwValue = Integer.parseInt(smallStreet(result).substring(29));
				resultName = "3Mały Street";
				break;
			}
			if (mainTable[4][playerNumber] == 0 && largeStreet(result).substring(0, 1).equals("1")) {
				throwValue = Integer.parseInt(largeStreet(result).substring(29));
				resultName = "4Duży Street";
				break;
			}
			if (mainTable[5][playerNumber] == 0 && threeKind(result).substring(0, 1).equals("1")) {
				throwValue = Integer.parseInt(threeKind(result).substring(29));
				result = threeGood(result);
				resultName = "5Trójka";
				continue;
			}
			if (mainTable[2][playerNumber] == 0 && twoPairs(result).substring(0, 1).equals("1")) {
				throwValue = Integer.parseInt(twoPairs(result).substring(29));
				result = fourGoodDifferent(result);
				resultName = "2Dwie pary";
				continue;
			}

			if (mainTable[1][playerNumber] == 0 && pair(result).substring(0, 1).equals("1")) {
				throwValue = Integer.parseInt(pair(result).substring(29));
				result = twoGood(result);
				resultName = "1Para";
				continue;
			}

			if (mainTable[0][playerNumber] == 0 && i == throwNumber - 1) {
				throwValue = Integer.parseInt(pair(result).substring(29));
				resultName = "0Szansa";
				break;
			}
			
			if (mainTable[0][playerNumber] == 0 && i < throwNumber - 1) {
				throwValue = Integer.parseInt(pair(result).substring(29));
				result = oneGood(result);
				resultName = "0Nic ciekawego";
				throwValue = 0;
				continue;
				}
			
			throwValue = -1;
			resultName = cancelPosition(mainTable, playerNumber) + "Wykreślamy";
		}
		outcome[0] = Integer.parseInt(resultName.substring(0, 1));
		outcome[1] = throwValue;
		System.out.println(resultName.substring(1) + "\nUzyskaliśmy punktów: " + throwValue);
		return outcome;
	}

	public static void mainGame( /* int humanPlayerNumber , */ String[] playersNames, int numberOfThrows) {
		Scanner scan = new Scanner(System.in);
		int table[][] = new int[10][playersNames.length];
		int numOfPlayers = playersNames.length;
		// głowna pętla dla 8 tur
		String heading = "###### WIRTUALNY POKER ######";
		printTable(table, playersNames, heading);
		System.out.println("Naciśnij ENTER");
		scan.nextLine();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < numOfPlayers; j++) {
				clearConsole();
				printTable(table, playersNames, heading);
				System.out.println("\n" + "Teraz rzuca " + playersNames[j]);
				int[] outcome = throwXTimes(numberOfThrows, table, j);
				table[outcome[0]][j] = outcome[1];
				System.out.println("Naciśnij ENTER");
				scan.nextLine();

			}
			// print tabela - wejście tabela główna i tabela imion
			// player 1 - CPU - wejście tabela, numer gracza, poziom ryzyka, wyjście tabela
			// player 2 - CPU - wejście tabela i numer gracza, poziom ryzyka, wyjście tabela

		}
		printTable(table, playersNames, heading);

	}

	public final static void clearConsole() {

		
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj ilość rzutów: ");
		while (!scan.hasNextInt()) {
			scan.next();
		}
		int numberOfThrows = scan.nextInt();

		// throwXTimes(numberOfThrows); // uruchamia jedną kolejkę komputera

		System.out.println("Podaj ilość graczy: ");
		while (!scan.hasNextInt()) {
			scan.next();
		}
		int numberOfPlayers = scan.nextInt();
		String[] playersNames = new String[numberOfPlayers];

		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.print("Podaj imię gracza nr " + (i + 1) + " (maksymalnie 7 liter): ");
			playersNames[i] = scan.next();
		}

		clearConsole();

		mainGame(playersNames, numberOfThrows);

	}
}
