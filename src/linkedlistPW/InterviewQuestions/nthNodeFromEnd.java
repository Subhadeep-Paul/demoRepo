package linkedlistPW.InterviewQuestions;


public class nthNodeFromEnd {

    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node nthNode ( Node head , int index){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;   //This method is done by traversing the linked list by two times
            temp = temp.next;
        }
        temp = head; // A better rabbit-turtle method is written below.
        for (int i = 0; i < (size - index) ; i++) {
               temp= temp.next;
        }
        return temp;
    }

    public static Node nthNode2(Node head, int index){
        Node rabbit = head;
        Node turtle = head;
        for (int i = 0; i < index ; i++) {
            rabbit = rabbit.next;
        }
        while(rabbit != null){
            turtle = turtle.next;
            rabbit = rabbit.next;
        }
        return turtle;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // Calling the above function in the main function
        Node hello = nthNode(a, 3);
        System.out.println(hello.data);
        display(a);
        Node hello2 = nthNode2(a , 3);
        System.out.println(hello2.data);

    }
}
