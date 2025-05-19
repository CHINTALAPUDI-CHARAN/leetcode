class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length;
        int tem1;
        int temp;
        for(int j=0;j<size-1;j++){
            for(int i=0;i<size-1-j;i++){
            if(nums[i]>nums[i+1]){
            temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            }}
        }
    }
}