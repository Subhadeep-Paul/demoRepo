package linkedlistPW;

public class implementation {
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        class Node{
            int data = 0;
            Node next;
            Node(int data){
                this.data = data;
            }
        }

        void insertAtEnd(int value){
            Node temp = new Node(value);
            if(head == null){ // Empty List;
                insertAtEnd(value);
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int value){
            Node temp = new Node(value);
            if (head == null){
                head = temp;
            }
            else {temp.next = head;
            head = temp;
            }
            tail = temp;
        }

        void insertAt( int index , int value){
            Node temp = head;
            Node newTemp = new Node(value);
            if (index == size()){
                insertAtEnd(value);
                return;
            }
            if (index == 0){
                insertAtHead(value);
                return;
            }
            for (int i = 0; i <index-1 ; i++) {
                    temp = temp.next;
            }
            newTemp.next = temp.next;
            temp.next = newTemp;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
         int size(){
            int count = 0;
            Node temp = head;
            while (temp != null){
                count++;
                temp = temp.next;
            }
             return count;
         }
         int getAt(int index){
            Node temp = head;
             for (int i = 1; i <= index ; i++) {
                 temp = temp.next;
             }
             return temp.data;
         }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtHead(7); // 7
        ll.insertAtEnd(10); // 7 10
        ll.insertAtEnd(8); // 7 10 8
        ll.insertAtEnd(99);
        ll.insertAt(4 , 11);
        ll.insertAt(0,22);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.getAt(0));
    }
}
