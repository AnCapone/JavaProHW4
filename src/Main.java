import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a string to find the number of occurances of a symbol in it: ");
        String inputString = scanner.nextLine();
        System.out.print("Please, enter a symbol to find the number of occurances: ");
        char symbol = scanner.next().toLowerCase().charAt(0);
        System.out.printf("The symbol '%s' occurs %d times in the string '%s''%n", symbol, findSymbolOccurance(inputString, symbol), inputString);
        scanner.close();
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


}