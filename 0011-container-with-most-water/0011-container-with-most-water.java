class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int cur_area = 0;
        while(left  < right){
            int l = right - left;
            int h = Math.min(height[left],height[right]);
            int area = l*h;
            cur_area = Math.max(area,cur_area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return cur_area;
    }
}