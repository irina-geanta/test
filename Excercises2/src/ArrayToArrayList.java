import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to convert an array to ArrayList.

public class ArrayToArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("How many elements has the array: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                String[] array = SortArrays.readStrArray(number, scanner);
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i<array.length; i++){
                    list.add(array[i]);
                }
                System.out.println("The array list: " + list.toString());
                break label;
            } else {
                System.out.println("Not an int. Existing");
                break label;
            }
        }
        scanner.close();
    }
}
