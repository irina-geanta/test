import java.util.Scanner;

// Write a program called SumProductMinMax that prompts user for three integers.
// The program shall read the inputs as int; compute the sum, product, minimum and maximum of the three integers; and print the results.
public class SumProductMinMax {
    private static int sum(int no1, int no2, int no3){
        return no1+no2+no3;
    }

    private static int product(int no1, int no2, int no3){
        return no1*no2*no3;
    }

    private static int min(int no1, int no2, int no3){
        int minimum = no1;
        if (no1 > no2){
            minimum = no2;
        } else if (no1 > no3){
            minimum = no3;
        }
        return minimum;
    }

    private static int max(int no1, int no2, int no3){
        int maximum = no1;
        if (no1 < no2){
            maximum = no2;
        } else if (no1 < no3){
            maximum = no3;
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter 3 numbers or exit pressing other characters: ");
            int number1, number2, number3 = 0;

            System.out.println("Number1: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                number1 = scanner.nextInt();
            } else{
                System.out.println("Not a number, exiting..");
                break;
            }
            System.out.println("Number2: ");
            isInt = scanner.hasNextInt();
            if (isInt) {
                number2 = scanner.nextInt();
            } else{
                System.out.println("Not a number");
                break;
            }
            System.out.println("Number3: ");
            isInt = scanner.hasNextInt();
            if (isInt) {
                number3 = scanner.nextInt();
            } else{
                System.out.println("Not a number");
                break;
            }
            System.out.println("Sum is: "+sum(number1, number2, number3));
            System.out.println("Product is: "+product(number1, number2, number3));
            System.out.println("Minimum is: "+min(number1, number2, number3));
            System.out.println("Maximum is: "+max(number1, number2, number3));
        }
        scanner.close();
    }
}
