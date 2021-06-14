import java.util.Arrays;
import java.util.Scanner;

// Write a program to sort an array of given integers using the Bubble sorting Algorithm.
// The principle of bubble sort is to scan the elements from left-to-right,
// and whenever two adjacent elements are out-of-order, they are swapped.

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        label:
        while(true){
            System.out.println("How many elements has the array: ");
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

                for (int i = 0; i < initialArray.length; i++){
                    for (int j = 1; j < initialArray.length-i; j++){
                        if (initialArray[j-1] > initialArray[j]){
                            int aux = initialArray[j-1];
                            initialArray[j-1] = initialArray[j];
                            initialArray[j] = aux;
                        }
                    }
                }
                System.out.println("Sorted array: " + Arrays.toString(initialArray));
                System.out.println("Exiting .. ");
                break;

            }else {
                System.out.println("Not an int. Existing");
                break;
            }
        }
        scanner.close();
    }
}
