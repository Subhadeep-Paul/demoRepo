package OOPSbyUdemy;

public class LinkedList {


    // Declaring the variables.
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;     // Here the Node class is inside the LinkedList class.
        Node next;    // This thing is known as inner class or Nested Class.

    public Node(int value){
            this.value = value;
        }
    }

    // One LinkedList class and three methods will be there.
    public LinkedList(int value){
        // Create a new Node
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        // Create a new node;
        // add node to the end
    }
    public void prepend(int value){
        // Create a new node
        // add node to the beginning
    }
    public boolean insert(int index, int value){
        // Create a new node
        // insert a node at a particular index
        return true;
    }

}
