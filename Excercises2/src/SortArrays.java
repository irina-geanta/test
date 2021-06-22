import java.util.Arrays;
import java.util.Scanner;

/*
Write a Java program to sort a numeric array and a string array. Check and use available Arrays methods.
*/
public class SortArrays {

    public static int[] readIntArray(int numberOfElements, Scanner scanner){
        int [] initialArray = new int[numberOfElements];
        for (int i =0; i<numberOfElements; i++){
            System.out.println("Please enter element " + (i+1) + " of the array");
            if (scanner.hasNextInt()){
                initialArray[i] = scanner.nextInt();
            } else{
                System.out.println("Not an int. Existing..");
                return null;
            }
        }
        System.out.println("Initial Array: " + Arrays.toString(initialArray));
        return initialArray;
    }

    public static String[] readStrArray(int numberOfElements, Scanner scanner){
        String [] initialArray = new String[numberOfElements];
        for (int i =0; i<numberOfElements; i++){
            System.out.println("Please enter element " + (i+1) + " of the array");
            initialArray[i] = scanner.next();
        }
        System.out.println("Initial Array: " + Arrays.toString(initialArray));
        return initialArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        label:
        while(true){
            System.out.println("Press i for an array of integers or s for an array of Strings or any other key to exit");
            String option = scanner.next();

            switch (option.toLowerCase()){
                case "i":
                    System.out.println("How many elements has the array: ");
                    if(scanner.hasNextInt()) {
                        int number = scanner.nextInt();
                        int[] intArray = readIntArray(number, scanner);
                        if (intArray != null){
                            Arrays.sort(intArray);
                            System.out.println("Sorted Array: " + Arrays.toString(intArray));
                        } else {
                            System.out.println("You did not add int elements in the array. Exiting..");
                            break label;
                        }
                    } else {
                        System.out.println("Not an int. Existing");
                        break label;
                    }
                    break;
                case "s":
                    System.out.println("How many elements has the array: ");
                    if(scanner.hasNextInt()) {
                        int number = scanner.nextInt();
                        String[] strArray = readStrArray(number, scanner);
                        Arrays.sort(strArray);
                        System.out.println("Sorted Array: " + Arrays.toString(strArray));
                    } else {
                        System.out.println("Not an int. Existing");
                        break label;
                    }
                    break;
                default:
                    System.out.println("Exiting..");
                    break label;
            }
        }
        scanner.close();
    }
}
