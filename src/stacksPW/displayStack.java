package stacksPW;

import java.util.Stack;

public class displayStack {

    public static void printRec(Stack<Integer> s){
        // Printing a stack using Recursion.
        if(s.size() == 0) return;
        int tempTopElement = s.pop();
        printRec(s);
        System.out.print(tempTopElement +" ");
        s.push(tempTopElement);
    }

    public static void printRevRec(Stack<Integer> stack){
        // Printing a stack in Reverse Order using Recursion.
        if(stack.size() == 0) return;
        int tempElement = stack.pop();
        System.out.print(tempElement + " ");
        printRevRec(stack);
        stack.push(tempElement);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int size = stack.size();
        // Printing Stack using Array.
        int[] arr = new int[size];
        for (int i = size-1; i >= 0 ; i--) {
            arr[i] = stack.pop();
        }
        for(int j = 0; j < arr.length ; j++) {
            System.out.print(arr[j] + " ");
            stack.push(arr[j]);
        }
        System.out.println();

        // Printing Stack using another Stack.
        Stack <Integer> rt = new Stack<>();
        while(stack.size()>0){
            rt.push(stack.pop());
        }
        while(rt.size()>0){
            System.out.print(rt.peek() + " ");
            stack.push(rt.pop());
        }
        System.out.println();
        printRec(stack);
        System.out.println();
        printRevRec(stack);
    }
}
