//Time Complexity : O(n)
//Space Complexity : O(1)
// tried on leetcode.

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        int count = 0;
        int sum =0;
        Map<Integer , Integer> rsum = new HashMap<>();
        rsum.put(0,1);
        for(int i = 0;i<nums.length ; i++)
        {
            sum += nums[i];
            if(rsum.containsKey(sum - k))
                count+= rsum.get(sum -k );
            
            rsum.put(sum , rsum.getOrDefault(sum , 0)+1);
        }
        return count;
    }
}