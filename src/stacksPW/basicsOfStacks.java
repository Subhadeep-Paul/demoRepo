package stacksPW;

import java.util.ArrayList;
import java.util.Stack; // <- This will automatically come in IntelliJ while declaring Stack.
// import java.util.*   <-- This line imports all thing in java.

public class basicsOfStacks {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Array declaration.
        ArrayList<Integer> arr1 = new ArrayList<>(); // Arraylist declaration.
        Stack <Integer> st = new Stack<>(); // Built-in Stack declaration.
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        System.out.println(st);
        while(st.size()>0){
            System.out.println("Size is: " + st.size() + " & Top element is: " + st.peek());
           st.pop();
        }
        System.out.println(st);
    }

    // In Stacks, it is always Pass By Reference.

        /* Stack is known as LIFO/FILO
        LIFO -> Last In, First Out;
        FILO -> First In, Last Out;

        .push() -> Inserting items into top of stack.
        .pop() -> Deleting topmost element.
        .peek() -> Viewing topmost element.
        .size() -> Size of Stack.
        System.out.println(Stack_Name) -> Print the stack.
         */
}
