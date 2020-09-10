// Time Complexity : O(log Y) --> where Y is the given input number
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (991): Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int brokenCalc(int X, int Y) {
        int count = 0;
        while (Y > X) {
            if (Y % 2 == 0) Y /= 2;
            else Y++;
            count++;
        }
        return count + X - Y;
    }
}