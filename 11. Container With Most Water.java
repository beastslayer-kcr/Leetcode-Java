class Solution {
    public int maxArea(int[] height) {
        int sum=Integer.MIN_VALUE;
        int n = height.length;
        int high = n-1;
        int low = 0;
        while(high>low){
            int x = Math.min(height[high],height[low]);
            sum = Math.max(sum,x*(high-low));
            if(height[high]>height[low]) low++;
            else high--;
        }
        return sum;
    }
}
