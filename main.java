package typing;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {

	public static String[] add(String[] words, int numberOfWords) {

		Random random = new Random();
		
		String array[] = new String[numberOfWords];

		for (int i = 0; i <= numberOfWords - 1; i++) {
			int x = random.nextInt(1000);
			array[i] = (words[x]);
			// System.out.println(array[i]);

		}

		return array;

	}

	public static String[] sort(String[] array, int n) {
		String temp;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (array[i].compareTo(array[j]) > 0) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static String[] createRandomWords(int userInput) throws FileNotFoundException {
		String words[] = new String[1000];
		File file = new File("C:\\Users\\nijog\\Downloads\\n.txt");
		Scanner sc = new Scanner(file);
		int t = 0;

		while (sc.hasNextLine()) {
			String x = sc.nextLine();
			words[t] = x;
			t++;
		}
		return words;
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		// asking user to input amount of words
		System.out.println("how many words would you like to test yourself on?");
		n = scanner.nextInt();

		// creating arrays to be used in various methods
		String[] words = createRandomWords(n);
		String[] array = add(words, n);
		String[] arraySorted = sort(array, n);

		// printing out the words in alphabetical order
		// Scanner scan = new Scanner(System.in);

		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);

		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);

		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);

//        Random rand = new Random();
//
//        for (int i = 0; i <= 3; i++) {
//            System.out.print(words[rand.nextInt(4)] + " ");
//
//        }
		for (int i = 0; i < n; i++) {
			System.out.print(arraySorted[i] + " ");

		}
		System.out.println();

		double startTime = LocalTime.now().toNanoOfDay();

		Scanner scan = new Scanner(System.in);
		
		String typedWords = scan.nextLine();
		System.out.println(typedWords);

		double endTime = LocalTime.now().toNanoOfDay();

		double difference = endTime - startTime;
		double seconds = difference / 1000000000.0;
		System.out.println("seconds "+seconds);

		int numChars = typedWords.length();

		int wpm = (int) ((((double) numChars / 5) / seconds) * 60);
		System.out.println("Your avg wpm is : " + wpm);

//        System.out.println(
//            "The words in alphabetical order are: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arraySorted[i]+" ");
//            
//        }
	}

}
