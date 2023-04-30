package L7_Questions_On_Subsequences;

// Question-3: Print Only The Number of SubSequence With GivenSum
public class PrintOnlyTheNumberOfSubSequenceWithGivenSum {
    public static void main(String[] args) {       

        int arr[] = new int[]{1, 2, 1};
        int n = arr.length;

        int givenSum = 2;
        
        int res = fun(0, 0, givenSum, arr, n);
        System.out.println("Number of SubSequence With GivenSum: " + res);
    }

    static int fun(int index, int sum, int givenSum, int arr[], int n){

        if(index == n){
            if(sum == givenSum){
                return 1;
            }
            return 0;
        }

        sum = sum + arr[index];
        int l = fun(index+1, sum, givenSum, arr, n);

        sum = sum - arr[index];
        int r = fun(index+1, sum, givenSum, arr, n);
        
        return l+r;
    }

}