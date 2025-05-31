class Solution {
    public int maximumCount(int[] nums) {
        int len = nums.length;
        int pos = 0;
        int neg =0;
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                pos++;
            }
            else if(nums[i]<0){
                neg++;
            }
            else{

            }
        }
        return Math.max(pos,neg);
    }
}