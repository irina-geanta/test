
// Write a Java program to iterate through all elements in a array list and print them.

import java.util.ArrayList;
import java.util.Scanner;

public class PrintElementsInArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();
        label:
        while (true) {
            System.out.println("Add element in array list or press q to quit: ");
            String element = scanner.next();
            if (!element.equalsIgnoreCase("q")){
                list.add(element);
            } else {
                break;
            }
        }
        for (int i=0; i<list.size(); i++){
            System.out.println("Element: " + i + " in the list: " + list.get(i));
        }
        scanner.close();
    }
}
