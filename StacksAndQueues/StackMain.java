package BridgeLabz.StacksAndQueues;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        System.out.println("Deleting element from queue ::");
        Queue queue = new Queue();

        queue.printList();
        /*
         * Adding element to the queue
         */
        queue.addNode(56);
        queue.addNode(30);
        queue.addNode(70);


    }
}