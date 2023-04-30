package L5_Multiple_Recursion_Calls;

// Multiple Recursion Calls

public class Fibonacci {
    public static void main(String[] args) {

        int n = 4;
        int res = fib(n);
        System.out.println(res);
    }

    static int fib(int n){
        if(n<=1){
            return n;
        }
        
        int firstLast = fib(n-1);
        int secondLast = fib(n-2);

        return firstLast + secondLast;

        // return fib(n-1) + fib(n-2);
    }
}
