package stacksPW;


public class arrayImplementation {
    public static class Stack {

        int[] arr = new int[5];
        int index = 0;

        void push(int element) {
            if(isFull()){
                System.out.println("Stack is Full!");
                return;
            }
            arr[index] = element;
            index++;
        }

        int pop() {
            if (index == 0) {
                System.out.println("The Stack is Empty!");
                return -1;
            }
            int temp = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return temp;
        }

        int peek() {
            if (index == 0) {
                System.out.println("The Stack is Empty!");
                return -1;
            }
            return arr[index - 1];
        }

        int size() {
            return index;
        }
        boolean isEmpty() {
            return size() == 0;
        }

        void display(){
            System.out.print("[ ");
            for (int i = 0; i <= index-1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
        }

        boolean isFull(){
            return (index == arr.length);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10); // 10
        st.push(20); // 10 20
        st.push(30); // 10 20 30
        st.pop(); // 10 20
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.size());
        st.display();
        st.push(70);
        st.display();
    }
}
