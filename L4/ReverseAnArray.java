package L4;

public class ReverseAnArray {
    public static void main(String[] args) {

        int a[] = new int[]{2, 3, 5, 6, 7};
        int n = a.length;

        // rev(a, 0, n-1);

        rev2(a, 0);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static void rev(int a[], int start, int end) {
        if(start>=end){
            return;
        }

        // Swap first and last
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        rev(a, ++start, --end);
    }

    // Another way just by one parameter i
    static void rev2(int a[], int i) {
        int n = a.length;
        if(i > n/2){
            return;
        }

        // Swap first and last
        int temp = a[i];
        a[i] = a[n-i-1];
        a[n-i-1] = temp;

        rev2(a, i+1);
    }
}
