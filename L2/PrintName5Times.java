package L2;

public class PrintName5Times {
    public static void main(String[] args) {
        int n = 1;
        name(n);
    }

    static void name(int n){
        if(n>=5){
            return;
        }
        n++;
        System.out.println("Sawan Kumar");

        name(n);
    }
}
