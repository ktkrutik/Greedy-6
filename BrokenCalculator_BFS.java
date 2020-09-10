// Time Complexity : O(2 ^ n) exponential
// Space Complexity : exponential
// Did this code successfully run on Leetcode (991): Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int brokenCalc(int X, int Y) {
        Queue<Integer> q = new LinkedList<>();
        q.add(X);
        int count = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                if (curr == Y) return count;
                if (curr > Y) q.add(curr - 1);
                else {
                    q.add(curr * 2);
                    q.add(curr - 1);
                }
            }
            count++;
        }
        return count;
    }
}