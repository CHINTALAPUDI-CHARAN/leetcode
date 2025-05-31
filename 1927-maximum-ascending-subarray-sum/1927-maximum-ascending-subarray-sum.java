class Solution {
    public int maxAscendingSum(int[] nums) {
     int max1 = nums[0];
     int max2 = nums[0];
     for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            max1 += nums[i];
        }
        else{
            if(max1>max2){
                max2=max1;
                
            }max1=nums[i];
        }
     }return Math.max(max2,max1);
    }
}