// Problem 1 : BinaryGap
// Find longest sequence of zeros in binary representation of an integer. 
// Solution Report - https://app.codility.com/demo/results/trainingYSKXMZ-B6R/

class Solution 
{
    public static String convertBinary(int N)
    {
        StringBuffer buffer = new StringBuffer("");
        while(N>0)
        {
            buffer.append(N%2);
            N/=2;
        }
        return new String(buffer.reverse());
    }
    public int solution(int N) 
    {
        String N2 = convertBinary(N);
        N2 = N2.substring(N2.indexOf("1")+1);
	int max = 0;
	while(N2.indexOf("1")!=-1)
	{
		int nextIndex = N2.indexOf("1");
		N2 = N2.substring(nextIndex+1);
		if(max<nextIndex) {
			max = nextIndex;
		}
	}
	return max;
    }
}
