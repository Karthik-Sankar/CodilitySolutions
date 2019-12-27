// 3. CyclicRotation
// Rotate an array to the right by a given number of steps.
// Solution Submission : https://app.codility.com/demo/results/training3NPBNT-TG7/
import java.util.*;

@FunctionalInterface
interface Rotation{
    int[] rotate(int[] a);
}

class Solution {
    public int[] solution(int[] A, int K) {
        Rotation r = (a)->{
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i:a)
            {
                list.add(i);
            }
            Collections.rotate(list, K);
            int lidx=list.size();
            for(int i=0;i<lidx;i++)
            {
                a[i] = (int)list.get(i);
            }
            return a;
        };
        return r.rotate(A);
    }
}
