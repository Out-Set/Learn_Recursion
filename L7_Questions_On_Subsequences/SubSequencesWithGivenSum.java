package L7_Questions_On_Subsequences;

import java.util.Stack;

// Question-1: SubSequences With GivenSum
public class SubSequencesWithGivenSum {
    public static void main(String[] args) {
        

        int arr[] = new int[]{1, 2, 1};
        int n = arr.length;

        int givenSum = 2;
        Stack<Integer> st = new Stack<Integer>();

        fun(0, st, 0, givenSum, arr, n);
    }

    static void fun(int index, Stack<Integer> st, int sum, int givenSum, int arr[], int n) {
        if(index == n) {
            if(sum == givenSum) {
                System.out.println(st);
            }
            return;
        }

        st.push(arr[index]);
        sum = sum + arr[index];
        fun(index+1, st, sum, givenSum, arr, n);
        
        st.pop();
        sum = sum - arr[index];

        fun(index+1, st, sum, givenSum, arr, n);
    }
}
