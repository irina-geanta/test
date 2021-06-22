/*
Write a function that takes an arbitrary number of integers as arguments and returns a collection of them stored in reverse order.
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArbitraryNumberOfArgs {

    public static List arbitraryNumber(int ... args){
        List linkedList = new LinkedList();
        for (int i=0; i< args.length; i++) {
            linkedList.add(args[i]);
        }
        Collections.reverse(linkedList);
        return linkedList;
    }
    public static void main(String[] args) {
        System.out.println(arbitraryNumber(10,15,20,22,34).toString());
        System.out.println(arbitraryNumber(2,15,44,99,22,34).toString());
        System.out.println(arbitraryNumber(10,55,2).toString());
        System.out.println(arbitraryNumber().toString());

    }
}
