package L7_Questions_On_Subsequences;

import java.util.Stack;

// Question-2: Print Only 1 SubSequence With GivenSum
// o/p: [1, 1]
public class PrintOnly1SubSequenceWithGivenSum {
    public static void main(String[] args) {
        
        int arr[] = new int[]{1, 2, 1};
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int givenSum = 2;

        fun(0, st, 0, givenSum, arr, n);

    }

    static boolean fun(int index, Stack<Integer> st, int sum, int givenSum, int arr[], int n) {

        if(index == n){
            if(sum == givenSum){
                System.out.println(st);
                return true;
            }
            else return false;
        }

        st.push(arr[index]);
        sum = sum + arr[index];

        if(fun(index+1, st, sum, givenSum, arr, n) == true) return true;
        sum = sum - arr[index];
        st.pop();

        if(fun(index+1, st, sum, givenSum, arr, n) == true) return true;             

        return false;
    }
}
