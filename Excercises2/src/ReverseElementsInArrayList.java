
//Write a Java program to reverse elements in a array list. Check available methods in Collections class.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseElementsInArrayList {


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
        System.out.println("Initial list: " + list.toString());
        Collections.reverse(list);
        System.out.println("The reversed elements: " + list.toString());
        scanner.close();
    }
}
