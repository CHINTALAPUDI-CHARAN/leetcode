class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int aLen = nums1.length;
        int bLen = nums2.length;
        double ans;
        int[] result = new int[aLen + bLen];

        System.arraycopy(nums1, 0, result, 0, aLen);
        System.arraycopy(nums2, 0, result, aLen, bLen);
        Arrays.sort(result);
        if(result.length%2==0){
          ans= result[(result.length-1)/2] + result[(result.length+1)/2];
          ans = ans/2;
        }
        else{
            ans = result[result.length/2];
        }return ans;
    }
}