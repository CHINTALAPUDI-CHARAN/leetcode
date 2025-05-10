class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int right =0;
        int cursum = 0;
        int minlength = Integer.MAX_VALUE;

        for(right = 0;right<nums.length;right++){
            cursum += nums[right];
            while(cursum >= target){
                if(right-left+1 < minlength){
                    minlength = right-left+1;
                }
                cursum -= nums[left];
                left++;
            }
        }
        return minlength != Integer.MAX_VALUE ? minlength : 0;
    }
}