class Solution {
    public int pivotIndex(int[] nums) {
        int arr[] = new int[nums.length];
        arr[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            arr[i] = arr[i-1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            int left = (i == 0) ? 0 : arr[i-1];
            int right = arr[nums.length-1] - arr[i];
            
            if(left == right){
                return i;
            }
        }
        
        return -1;
    }
}