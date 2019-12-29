// Problem 6 : TapeEquilibrium
// Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
// Report : https://app.codility.com/demo/results/trainingUSV7CH-HKX/
// Complexity : O(n)

class Solution {
    public long modsum(int[] A)
    {
        long ret=0;
        for(int i=0;i<A.length;i++)
            ret+=A[i];
        return ret;
    }
    public int solution(int[] A) {
        long a = A[0];
        long b = modsum(A)-a;
        long min = Math.abs(a-b);
        for(int i=1;i<A.length-1;i++)
        {
            a+=A[i];
            b-=A[i];
            long tmin = Math.abs(a-b);
            if(tmin<min) min = tmin;   
        }
        return (int)min;
    }
}
