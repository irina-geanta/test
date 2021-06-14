import java.util.Scanner;

public class CountVowelsDigits {
    //Write a program called CountVowelsDigits, which prompts the user for a String,
    // counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string,
    // and prints the counts.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countVowels;
        int countDigits;

        while(true) {
            System.out.println("Enter a String or exit typing exit: ");

            String stringToVerify = scanner.next();
            if (stringToVerify.equalsIgnoreCase("exit")){
                System.out.println("exiting");
                break;
            }

            char[] letters = stringToVerify.toCharArray();
            countDigits = 0;
            countVowels =0;
            for (int i = 0; i<letters.length; i++){
                if (letters[i] == 'A' || letters[i] == 'a' || letters[i] == 'E' || letters[i] == 'e' || letters[i] == 'I'
                        || letters[i] == 'i' || letters[i] == 'O' || letters[i] == 'o' || letters[i] == 'U' || letters[i] == 'u'){
                    countVowels += 1;
                } else if (letters[i] == '0' || letters[i] == '1' || letters[i] == '2' || letters[i] == '3' || letters[i] == '4'
                        || letters[i] == '5' || letters[i] == '6' || letters[i] == '7' || letters[i] == '8' || letters[i] == '9'){
                    countDigits += 1;
                }
            }
            System.out.println("Number of vowels: " + countVowels);
            System.out.println("Number of digits: " + countDigits);

        }
        scanner.close();

    }
}
