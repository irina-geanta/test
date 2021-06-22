import java.util.LinkedList;
import java.util.ListIterator;

/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

 */
public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList();
        LinkedList<Integer> list2 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(4);
        list1.add(9);
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(66);
        list2.add(67);


        LinkedList<Integer> mergedList = new LinkedList();
        ListIterator iterator1 = list1.listIterator();
        ListIterator iterator2 = list2.listIterator();
        System.out.println("lista1: "+ list1.toString());
        System.out.println("lista2:  "+ list2.toString());

        while(iterator1.hasNext() && iterator2.hasNext()){

            int next1 = (int)iterator1.next();
            int next2 = (int)iterator2.next();
            if(next1 < next2){
                mergedList.add((int)iterator1.previous());
                iterator1.next();
                iterator2.previous();

            } else if (next1 == next2){
                mergedList.add((int)iterator1.previous());
                mergedList.add((int)iterator2.previous());
                iterator1.next();
                iterator2.next();
            }
            else {
                mergedList.add((int)iterator2.previous());
                iterator2.next();
                iterator1.previous();
            }

        }
        if (list1.size() > list2.size()){
            while (iterator1.hasNext()){
                mergedList.add((int)iterator1.next());
            }
        } else {
            while (iterator2.hasNext()){
                mergedList.add((int)iterator2.next());
            }
        }

        System.out.println(mergedList.toString());
    }
}
