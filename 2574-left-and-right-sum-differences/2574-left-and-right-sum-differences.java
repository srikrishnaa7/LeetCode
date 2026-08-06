class Solution {
    public int[] leftRightDifference(int[] nums) {

       int leftarr[] = new int[nums.length]; 
       int rightarr[] = new int[nums.length]; 
       int arr[] = new int[nums.length];
       
       for(int i = 1; i < nums.length;i++){
            leftarr[i] = leftarr[i-1] + nums[i-1];
       }
       
       for(int i = nums.length-2; i >= 0;i--){
            rightarr[i] = rightarr[i+1] + nums[i+1];
       }
       
       for(int i = 0;i < nums.length;i++){
        arr[i] = Math.abs(leftarr[i] - rightarr[i]); 
       }
       
       return arr;
    }
}