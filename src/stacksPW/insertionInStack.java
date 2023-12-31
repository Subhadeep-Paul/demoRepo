package stacksPW;

import java.util.Scanner;
import java.util.Stack;

public class insertionInStack {
    public static void pushAtIndexRec(Stack<Integer> stack , int index , int ele){
        if (stack.size() == index){
            stack.push(ele);
            return;
        }          // Insertion in Stack using Recursion.
        int topElement = stack.pop();
        pushAtIndexRec(stack , index , ele);
        stack.push(topElement);
    }

    public static void popAtIndexRec(Stack<Integer> stack , int index){
        if (stack.size() == index+1){
            stack.pop();
            return;
        }          // deletion in Stack using Recursion.
        int topElement = stack.pop();
        popAtIndexRec(stack , index);
        stack.push(topElement);
    }

    public static void pushAtBottomRec(Stack<Integer> st, int element){
        if (st.size() == 0){
            st.push(element);
            return;
        }
        int topElement = st.pop();
        pushAtBottomRec(st , element);
        st.push(topElement);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements to add in the Stack: ");
        int number = sc.nextInt() ;
        System.out.println("Enter the elements: ");
        for (int i = 1; i <= number; i++) {
            st.push(sc.nextInt());
        }
        System.out.println(st);

        // Insertion in stack by using one more stack or array.
        int index = 1;
        int item = 100;
        Stack<Integer> Temp = new Stack<>();
        while(st.size()> index){
            Temp.push(st.pop());
        }
        st.push(item);
        while(Temp.size()>0){
            st.push(Temp.pop());
        }
        System.out.println(st);

        pushAtIndexRec(st, 2, 9);
        System.out.println(st);
        popAtIndexRec(st ,2);
        System.out.println(st);
        pushAtBottomRec(st , 5);
        System.out.println(st);
    }
}
