import java.util.ArrayList;
import java.util.Scanner;

public class TestEmptyArrayList {
    //write another program to test if the array list is empty.
    //Not very clear what is to be done here .. another program..

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();

        list = EmptyAnArrayList.readArrayList(scanner);

        if (EmptyAnArrayList.empty(list).isEmpty()){
            System.out.println("Array List is empty!");
        } else {
            System.out.println("Array List not empty!");
        }
        scanner.close();
    }
}
