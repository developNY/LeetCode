class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int l=0, r=height.length-1;
        
        while(l<r){
            int tmp = (r-l) * Math.min(height[l], height[r]);
            area = Math.max(area, tmp);
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        
        return area;
    }
}