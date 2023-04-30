package L10_SubSet_Sums;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SubsetSumI {
    public static void main(String[] args) {
        
        int arr[] = new int[]{3, 1, 2};
        int n = arr.length;

        ArrayList<Integer> al = new ArrayList<>();

        fun(0, al, 0, arr, n);

        Collections.sort(al);
        System.out.println(al);
    }

    static void fun(int index, ArrayList<Integer> al, int sum, int arr[], int n) {

        if(index == n){
            al.add(sum);
            return;
        }

        // Pick
        fun(index+1, al, sum+arr[index], arr, n);

        // Not Pick
        fun(index+1, al, sum, arr, n);
    }
}
