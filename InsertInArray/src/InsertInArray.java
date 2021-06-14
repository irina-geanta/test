import java.util.Arrays;
import java.util.Scanner;

public class InsertInArray {
// Write a program to insert an element (specific position) into an array.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        label:
        while(true){
            System.out.println("How many elements has the initial array: ");

            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                int [] initialArray = new int[number];
                for (int i =0; i<number; i++){
                    System.out.println("Please enter element " + (i+1) + " of the array");
                    if (scanner.hasNextInt()){
                        initialArray[i] = scanner.nextInt();
                    } else{
                        System.out.println("Not an int. Existing..");
                        break label;
                    }
                }
                System.out.println("Initial Array: " + Arrays.toString(initialArray));
                System.out.println("Please enter the new element in array: ");
                if (scanner.hasNextInt()){
                    int newElement = scanner.nextInt();
                    System.out.println("Please enter at what position in the array you want to add the new element: ");
                    if (scanner.hasNextInt()) {
                        int position = scanner.nextInt();
                        if((position > 0) && (position <= initialArray.length)) {

                            int[] newArray = new int[number + 1];
                            newArray[position-1] = newElement;
                            for (int i = 0; i < number + 1; i++) {
                                if (i < position-1) {
                                    newArray[i] = initialArray[i];
                                } else if (i == position-1) {
                                    continue;
                                } else {
                                    newArray[i] = initialArray[i - 1];
                                }
                            }
                            System.out.println("The new array: " + Arrays.toString(newArray));
                            System.out.println("Exiting..");
                            break label;
                        }else{
                            System.out.println("Not between 1 and " + initialArray.length);
                            break label;
                        }
                    } else{
                        System.out.println("Not an int. Existing..");
                        break label;
                    }
                } else {
                    System.out.println("Not an int. Exiting..");
                    break label;
                }

            }else {
                System.out.println("Not an int. Existing");
                break;
            }

        }
        scanner.close();
    }
}
