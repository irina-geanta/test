import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to find the common elements between two arrays (string values).
Use two for loops to cover every element in the arrays.
 */

public class CommonElementsInArray {
    public static ArrayList<String> commonElements (String [] array1, String[] array2){
        int count = 0;
        ArrayList<String> commonElementList = new ArrayList<>();

        for (String str1 : array1){
            for (String str2 : array2){
                if (str1.equalsIgnoreCase(str2)){
                    count +=1;
                    commonElementList.add(str1);
                }
            }
        }
        if (count == 0){
            System.out.println("No common elements.");
            return null;
        } else {
            return commonElementList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("How many elements has the first array: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                String[] firstArray = SortArrays.readStrArray(number, scanner);
                System.out.println("How many elements has the second array: ");
                if (scanner.hasNextInt()) {
                    String[] secondArray = SortArrays.readStrArray(scanner.nextInt(), scanner);
                    ArrayList<String> common = commonElements(firstArray, secondArray);
                    if (common != null){
                        System.out.println("Common elements between the 2 arrays: " + common.toString());
                    }
                } else {
                    System.out.println("Not an int. Exiting");
                }
                break label;
            } else {
                System.out.println("Not an int. Existing");
                break label;
            }
        }
        scanner.close();
    }
}
