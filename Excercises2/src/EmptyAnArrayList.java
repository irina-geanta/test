import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to empty an array list and write another program to test if the array list is empty.
public class EmptyAnArrayList {

    public static ArrayList readArrayList (Scanner scanner){
        ArrayList list = new ArrayList();
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
        return list;
    }
    public static ArrayList empty(ArrayList arrayList){
        if (arrayList.isEmpty()){
            System.out.println("List Already Empty..");
        } else {
            arrayList.removeAll(arrayList);
            System.out.println("array list: " + arrayList.toString());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();

        list = readArrayList(scanner);
        empty(list);
        scanner.close();
    }
}
