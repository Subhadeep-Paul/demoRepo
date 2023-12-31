package stacksPW;
import java.util.*;

public class nextGreaterElement {
    public static int[] isResolved(int[] arr){
        int x = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[x];
        ans[x-1] = -1;
        st.push(arr[x-1]);
        for (int i = x-2; i >=0 ; i--) {
            while( st.size() > 0 && arr[i]>st.peek()){
                st.pop();
            }
            if (st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1 ,3 ,2 ,1 ,8, 6, 3, 4};
        int[] ans = isResolved(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }

    }
}
