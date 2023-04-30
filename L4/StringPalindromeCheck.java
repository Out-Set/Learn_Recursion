package L4;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        
        String s = "MaDaM";
        System.out.println(isPal(s, 0));
    }

    static boolean isPal(String s, int i) {

        int n = s.length();
        if(i >= n/2) {
            return true;
        }

        if(s.charAt(i) != s.charAt(n-i-1)) {
            return false;
        }

        return isPal(s, i+1);
    }
}
