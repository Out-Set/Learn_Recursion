package L6_SubSequences;

import java.util.Stack;

public class SubSequences {
    public static void main(String[] args) {
        
        int arr[] = new int[]{3, 1, 2};
        int n = 3;

        // Used stack because it has pop() function, so it removes the 
        // last element without passing index of the last element.
        Stack<Integer> st = new Stack<Integer>();

        subSeq(0, st, arr, n);
    }

    static void subSeq(int index, Stack<Integer> st, int arr[], int n) {

        if(index == n) {
            System.out.println(st);

            // If Stack is empty
            if(st.size() == 0){
                System.out.println("{}");
            }
            return;
        }    

        st.push(arr[index]); 
        subSeq(index + 1, st, arr, n);

        st.pop();
        subSeq(index + 1, st, arr, n);
    }
}
