package all_about_array;

public class miscProblems {


    public static void printArray(int[] arr){
        for(int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
    }

    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    static void swapWithoutTemp(int a, int b){
        a = a+b;
        b= a-b;
        a = a-b;
    }

    public static int[] reverseArray1(int[] arr){
        int j =0;
        int[]  ans = new int[arr.length];
        for (int i = (arr.length -1) ; i>=0 ;i--){
            ans[j] = arr[i];
            j++;     // Problem with this approach is that some new memory is occupying unnecessarily,
        }           // because we have created a new array.
        return ans;
    }
    public static void swapInArray(int[] arr , int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void reverseArray(int[] arr){
        int head = 0;
        int tail = arr.length-1;
        while(head < tail){
            swapInArray(arr , head++, tail--);
        }
    }

    static void rotateArray(int[] Array_Name , int n){
        n = n % Array_Name.length;
        for (int i = 0; i <= Array_Name.length - n -1 ; i++) {
            reverseArray(Array_Name);
        }
        for (int i = Array_Name.length - n ; i <= n ; i++) {
            reverseArray(Array_Name);
        }
        for (int i = 0; i < n; i++) {
            reverseArray(Array_Name);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        printArray(array);
        
        printArray(array);
    }
}
