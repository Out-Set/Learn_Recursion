package L3;

public class SumOfFirstN {
    public static void main(String[] args) {
        
        System.out.println(sum(6));
    }
    
    static int sum(int n) {
        if(n==0){
            return 0;
        }

        return n + sum(n-1);
    }
}
