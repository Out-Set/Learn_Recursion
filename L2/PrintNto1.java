package L2;

public class PrintNto1 {
    public static void main(String[] args) {
        int n =100;
        // Nto1(n, n);

        WithBackTracking_Nto1(n);
    }

    // Without Backtracking
    static void Nto1(int i, int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        Nto1(i-1, n);           
    }

    // With Backtracking
    static void WithBackTracking_Nto1(int n){
        if(n==0){
            return;
        }

        System.out.println(n); 
        WithBackTracking_Nto1(n-1);                           
    }
}
