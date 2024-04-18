import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter a string to find the number of occurances of a symbol in it: ");
        String inputString = scanner.nextLine();
        System.out.print("Please, enter a symbol to find the number of occurances: ");
        char symbol = scanner.next().toLowerCase().charAt(0);
        System.out.printf("The symbol '%s' occurs %d times in the string '%s''%n", symbol, findSymbolOccurance(inputString, symbol), inputString);

        System.out.print("Please, enter a source string: ");
        String source = scanner.nextLine();
        System.out.print("Please, enter a target string to find its position in the source string: ");
        String target = scanner.nextLine();
        System.out.printf("Result: %d%n", findWordPosition(source, target));

        scanner.close(); */
        guessWordGame();
    }

    public static int findSymbolOccurance(String str, char symbol) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        source = source.toLowerCase();
        target = target.toLowerCase();
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        return str.equals(stringReverse(str));
    }

    public static void guessWordGame() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random randomizer = new Random();
        String word = words[randomizer.nextInt(words.length)];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, guess the word: ");
        while (true) {
            String guess = scanner.nextLine();
            if (word.equals(guess)) {
                System.out.println("Congratulations! You guessed the word!");
                break;
            } else {
                System.out.println("Sorry, you didn't guess the word. Here are the matching letters:");
                for (int i = 0; i < word.length() && i < guess.length(); i++) {
                    if (word.charAt(i) == guess.charAt(i)) {
                        System.out.print(word.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                for (int i = word.length(); i < 15; i++) {
                    System.out.print("#");
                }
                System.out.println();
                System.out.print("Try again: ");
            }
        }
        scanner.close();
    }
}