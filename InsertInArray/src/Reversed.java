import java.util.Scanner;

public class Reversed {
    // Write a program that prompts user for a positive integer.
    // The program shall read the input as int; and print the "reverse" of the input integer.
    // (input: 12345 reverse: 54321)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number;
        String result="";
        while(true) {
            System.out.println("Enter a positive integer numbers or exit pressing other characters: ");

            boolean isInt = scanner.hasNextInt();
            if (isInt) {

                number = scanner.nextInt();
                if (number < 0){
                    System.out.println("The number is not positive, exiting ..");
                    break;
                }

            } else{
                System.out.println("Not a number, exiting..");
                break;
            }
            String str = number.toString();
            char [] array = str.toCharArray();
            for (int i=array.length-1; i>=0; i--){
                result = result + array[i];
             }
            System.out.println("Reversed: " + result);
        }
        scanner.close();

    }

}
