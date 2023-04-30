package L2;

public class Print1toN {
    public static void main(String[] args) {
        int n =100;
        // Nto1(1, n);

        WithBackTracking_1toN(n);
    }

    // Without Backtracking
    static void Nto1(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        Nto1(i+1, n);            
    }

    // With Backtracking
    static void WithBackTracking_1toN(int n){
        if(n==0){
            return;
        }

        WithBackTracking_1toN(n-1);
        System.out.println(n);                            
    }
}
