package Sorting;

import java.util.LinkedList;

public class LinkedListDemo {



    public static void main(String ar[]){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(1,5);
        linkedList.set(1,6);
        System.out.println(linkedList);
        linkedList.remove(1);

        LinkedList<String> ll = new LinkedList();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        System.out.println(ll);
    }

}
