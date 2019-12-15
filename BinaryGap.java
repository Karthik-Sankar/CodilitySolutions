// Problem 1 : BinaryGap
// Find longest sequence of zeros in binary representation of an integer. 
// Solution Report - https://app.codility.com/demo/results/trainingYSKXMZ-B6R/

class Solution 
{
    public static String convertBinary(int N)
    {
        StringBuffer binseq = new StringBuffer("");
        while(N>0)
        {
            binseq.append(N%2);
            N/=2;
        }
        return new String(binseq.reverse());
    }
    public int solution(int N) 
    {
        String base = convertBinary(N);
        Pattern p = Pattern.compile("1(.*)1");
        Matcher m = p.matcher(base);
        System.out.println(m.group(1));
        return 0;
    }
}
