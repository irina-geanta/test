import java.util.Scanner;

/* Write a program to check if a given string has all unique characters. Return the result as a boolean value.*/
public class UniqueChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a String or type exit to exit: ");

            String stringToVerify = scanner.next();
            if (stringToVerify.equalsIgnoreCase("exit")){
                System.out.println("exiting..");
                break;
            }
            char[] letters = stringToVerify.toCharArray();
            loop:
            for (int i = 0; i < letters.length - 1; i++) {
                for (int j = i+1; j < letters.length; j++) {

                    if (letters[i] == letters[j]) {
                        System.out.println("String doesn't have unique characters");
                        break loop;
                    } else {
                        if ((i == letters.length - 2) && (j == letters.length-1)) {
                            System.out.println("String has unique characters");
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
