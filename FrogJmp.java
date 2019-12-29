// Problem 4: FrogJmp
// Count minimal number of jumps from position X to Y.
// Solution Report : https://app.codility.com/demo/results/trainingTSBBUX-DNF/
// Complexity : O(1)

class Solution {
    public int solution(int X, int Y, int D) {
        return (int)Math.ceil((double)(Y-X)/(double)D);
    }
}
