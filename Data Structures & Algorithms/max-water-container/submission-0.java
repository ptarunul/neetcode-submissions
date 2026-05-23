class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r= heights.length-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            int minHeight= Math.min(heights[l],heights[r]);
            int area=minHeight*(r-l);
            max=Math.max(area,max);

            while(l<r && heights[l]<=minHeight) l++;
            while(l<r && heights[r]<=minHeight) r--;
               }
    
    return max;
    }

}
