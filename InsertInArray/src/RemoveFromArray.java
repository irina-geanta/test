import java.util.Arrays;
import java.util.Scanner;
// Write a program to remove all occurrences of a specified value in a given array of integers and return the new array.
// There can be duplicates in the array.

public class RemoveFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        label:
        while(true){
            System.out.println("How many elements has the initial array: ");

            //boolean isInt = scanner.hasNextInt();
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
                System.out.println("Please enter the element you want to remove: ");
                if (scanner.hasNextInt()){
                    int toBeRemoved = scanner.nextInt();
                    int counter = 0;
                    for (int i=0; i<initialArray.length; i++){
                        if (initialArray[i] == toBeRemoved){
                            counter += 1;
                        }
                    }
                    if(counter == 0){
                        System.out.println("Nothing to be removed!");
                        break label;
                    } else if (counter == initialArray.length){
                        System.out.println("All elements are the same. The new array will be empty");
                        break label;
                    }
                    else{
                        int [] newArray = new int[initialArray.length - counter];
                        int newCounter = 0;
                        for(int i=0; i<initialArray.length; i++){
                            if (initialArray[i] == toBeRemoved){
                                newCounter += 1;
                            } else {
                                newArray[i-newCounter] = initialArray[i];
                            }
                        }
                        System.out.println("New array without element: " + toBeRemoved + ": "+ Arrays.toString(newArray));
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
