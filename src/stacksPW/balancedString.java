package stacksPW;

import java.util.Scanner;
import java.util.Stack;

public class balancedString{
    public static boolean isBalanced(String S){
        Stack<Character> st = new Stack<>();
        char c;
        for (int i = 0; i < S.length() ; i++) {
            c = S.charAt(i);
            if (c == '(') st.push(c);
            else{
                if (st.isEmpty()) return false;
                if (st.peek() == '(') st.pop();
            }
        }
        return st.isEmpty();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(isBalanced(s));
    }
}
