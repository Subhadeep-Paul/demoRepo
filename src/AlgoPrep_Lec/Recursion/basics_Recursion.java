package AlgoPrep_Lec.Recursion;

public class basics_Recursion {

    public static void main(String[] args) {

        System.out.println(summation(2));
        System.out.println(factorial(3));

        // Printing of nth Fibonacci number.
        System.out.println(nthFibNum(5));

        // Printing up to Nth Fibonacci Number.
        for (int i = 0; i < 10; i++) {
            System.out.print(nthFibNum(i) + " ");
        }
        System.out.println();


        printNth(20);
        System.out.println();

        printNth2(20);
        System.out.println(Power1(0,10));

        System.out.println(sumOfDigits(123));

        System.out.println(countOfDigits(1200000));

        System.out.println(Power2(2,2));

    }

    // Sum of natural numbers up to N. (via Recursive Approach)
    static int summation(int N){
        if (N == 1){return 1;}
        int Temp = summation(N-1);
        return Temp + N;
    }

    // Factorial of N. (Via Recursive Approach)
    static int factorial (int N){
        if (N == 1|| N == 0){return 1;}
        return N * factorial(N-1);
    }

    // Printing Nth Fibonacci Number.
    static int nthFibNum(int N){
        if(N == 0){
            return 0;
        }       // More Optimised code will be [ if ( N == 0 || N == 1 ) { return N;} ]
        if (N ==1){
            return 1;
        }
        int Temp = nthFibNum(N-1);
        int Temp2 = nthFibNum(N-2);
        return Temp + Temp2;
    }

    // Printing all natural numbers from 1 to n via Recursion.
    public static void printNth(int N){
        if (N == 1 ){
            System.out.print(1 + " ");
            return;
        }
        printNth(N-1);
        System.out.print(N + " ");
    }


    // Printing all natural numbers from n to 1 via Recursion.
    public static void printNth2(int N){
        if (N == 1){
            System.out.println(1);
            return;
        }
        System.out.print(N + " ");
        printNth2(N-1);
    }


    // Calculation of Power - Method 1 (Via Recursion)
    static int Power1(int a , int n){
        if (a == 0) return 0;
        if (n == 0) return 1;
        return Power1(a , n-1) * a;
    }

    // Calculation of Power - Method2
    static int Power2(int a , int n){
        if (n == 0) {
            return 1;
        }
        int smallPow = Power2(a, n/2);
        if (n%2 == 0){
            return smallPow * smallPow;
        }
        return smallPow * smallPow * a;
    }


    // Calculation of sum of digits.
    static int sumOfDigits(int n){
        if (n >= 0 && n<= 9)  // My Initial thinking
            return n;         // if ( n == 0 ) return 0;   // A little bit lengthy;
        return sumOfDigits(n/10) + n%10;
    }

    //Count of Digits in a given number.
    static int countOfDigits(int n){
        if (n >= 1 && n<=9) return 1;
        return countOfDigits(n/10) + 1;
    }


    // calculation of Power - Method 2 (via Recursion)


}
