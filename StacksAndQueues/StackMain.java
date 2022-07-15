package BridgeLabz.StacksAndQueues;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        System.out.println("Deleting element from queue ::");
        Stack stack = new Stack();

        /*
         * Adding element to the queue
         */
        stack.addNode(56);
        stack.addNode(30);
        stack.addNode(70);
        stack.printList();

        /*
         * deleting element from queue
         */
        stack.deleteHead();
        stack.printList();
    }
}

