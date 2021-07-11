//Time Complexity : O(n)
//Space Complexity : O(n)
// tried on leetcode.

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int maxlen =0,sum =0;
        Map<Integer,Integer> rsum = new HashMap<>();
        rsum.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
           sum+=(nums[i]==1 ? 1: -1);
            if(rsum.containsKey(sum))
                maxlen = Math.max(maxlen ,i - rsum.get(sum));
            else
                rsum.put(sum,i);
        }
        return maxlen;
    }
}