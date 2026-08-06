class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int leftsum = 0;
        int rightsum = 0;
        for(int i : nums){
            rightsum += i;
        }
        for(int i = 0;i < n ;i++){
            rightsum -= nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}