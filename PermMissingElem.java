// Problem 5 :  PermMissingElem
// Find the missing element in a given permutation
// Solution Report : https://app.codility.com/demo/results/training3W2W8U-35Z/
// Complexity : O(n)

class Solution {
    public int solution(int[] A) {
        long max = A.length+1;
        long sum = 0;
        long sum_natural = 0;
        for(int i=0; i<A.length; i++)
            sum+=A[i];
        sum_natural = (max*(max+1))/2;
        return (int)(sum_natural-sum);
    }
}
