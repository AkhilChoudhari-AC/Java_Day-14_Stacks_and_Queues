package BridgeLabz.StacksAndQueues;

public class StackMain {

    public static void main(String[] args) {

        System.out.println("inserting element into stack ::");
        System.out.println("deleting element ::");
        /*
         * 1.creating an Oject of class Stack
         */
        Stack stack = new Stack();

        /*
         * Calling mathod addNode to add elements
         */
        stack.addNode(70);
        stack.addNode(30);
        stack.addNode(56);

        /*
         * Calling Method Peak it will returns the value of what is on the top of the
         * stack
         */
        stack.peak();

        /*
         * pop: Created Method deleteHead will remove the value of the stack and then
         * return it
         */
        stack.deleteHead();
        stack.printList();
        stack.peak();
        stack.deleteHead();
        stack.printList();
        stack.peak();
        stack.deleteHead();

    }
}