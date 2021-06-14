import java.util.Scanner;
//Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
// The program shall always print “bye!” before exiting.
public class CheckOddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number or any other character to exit: ");

            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                if(number%2 == 0){
                    System.out.println("Even number");
                }else{
                    System.out.println("Odd number");
                }
            }else {
                System.out.println("Not an int");
                System.out.println("bye!");
                break;
            }
        }
        scanner.close();
    }
}

