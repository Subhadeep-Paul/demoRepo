package stacksPW;

import java.util.Scanner;
import java.util.Stack;

public class movingOfStack {
    public static void pushAtBottomRec(Stack<Integer> st, int element){
        if (st.size() == 0){
            st.push(element);
            return; // Without Creating extra Space.
        }  // Inserting an element at the bottom of the stack recursively.
        int topElement = st.pop();
        pushAtBottomRec(st , element);
        st.push(topElement);
    }
    public static void revStackRec(Stack<Integer> stack){
        if (stack.size() == 1) return;
        int tempElement = stack.pop();
        revStackRec(stack);     // Reversing a Stack Recursively.
        pushAtBottomRec(stack , tempElement);
    }
    public static void main(String[] args) {
        Stack<Integer> gt = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements to add in the Stack: ");
        int number = sc.nextInt() ;
        System.out.println("Enter the elements: ");
        for (int i = 1; i <= number; i++) {
            gt.push(sc.nextInt());
        }
        System.out.println(gt);

        // Moving the Older items into the new stack in Reverse Order.
         Stack <Integer> rt = new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);

        // Move into another stack in Reverse order.
        // Notice Carefully, This is in the same order as of First one.
        Stack <Integer> st = new Stack<>();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);

        revStackRec(st);
        System.out.println(st);
    }
}
