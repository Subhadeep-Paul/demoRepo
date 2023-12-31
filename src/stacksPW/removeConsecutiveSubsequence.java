package stacksPW;

import java.util.Stack;

public class removeConsecutiveSubsequence {
    public static int[] removeConsecutiveElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            }
            else{
                if(i == arr.length -1 || arr[i] != arr[i+1]) st.pop();
            }
        }
        int[] array = new int[st.size()];
        for (int i = array.length-1; i >= 0 ; i--) {
            arr[i] = st.pop();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2,2};
        int[] res = removeConsecutiveElement(arr);
        for (int i = 0; i<res.length ; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
