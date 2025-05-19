class Solution {
    public String triangleType(int[] nums) {
        String str = "";
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if(a+b>c && b+c>a && c+a>b){
        if(a==b && b == c){
            str = "equilateral";
        }
        else if( a == c || a == b || b == c){
            str = "isosceles";
        }
        else if(a != b && a != c && b != c){
            str = "scalene";
        }}
        else{
            str = "none";
        }
        return str;
    }
}