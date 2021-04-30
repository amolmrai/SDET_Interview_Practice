package Sorting;


import java.util.LinkedList;

public class NthToLastElement {

    public static class Node {
        private int value;
        private Node next;
        Node (int value){
            this.value = value;
        }
    }

    public static Node nthToLast(Node node,int n){
        Node curr = node;
        Node ptr = node;

        for(int i = 0; i<n;i++){
            if(curr == null){
                return null;
            }
            curr = curr.next;
        }
        while(curr != null){
            curr = curr.next;
            ptr = ptr.next;
        }
        return ptr;
    }

    public static void main(String str[]){
        LinkedList ll  = new LinkedList();
        Node node = new Node(5);
        ll.addLast(node);
        for(int i = 0; i<6;i++){
           // ll.(new Node(i));
        }
        nthToLast(node,2);
    }

}
