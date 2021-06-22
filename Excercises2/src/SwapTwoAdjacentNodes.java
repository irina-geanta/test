import java.util.Collections;
import java.util.LinkedList;

/*
Write a Java program to swap every two adjacent nodes of a given linked list.
Original Linked list: 10->20->30->40->50
Expected Output: 20->10->40->30->50
 */
public class SwapTwoAdjacentNodes {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = (LinkedList) ArbitraryNumberOfArgs.arbitraryNumber(10,20,30,40,50);
        Collections.reverse(list); // I wanted to use the previously created method, well needed to reverse them back..
        System.out.println(list.toString());

        for (int i=1; i<list.size(); i=i+2){
            list.add(i-1,list.get(i));
            list.remove(i+1);
        }

        System.out.println(list.toString());
    }
}
