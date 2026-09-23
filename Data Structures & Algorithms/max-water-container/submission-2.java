class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int max_amount= Integer.MIN_VALUE;
        while(l<r){
            int amount= (r-l)*Math.min(heights[l],heights[r]);
            max_amount= Math.max(max_amount, amount);

            if(heights[r]<heights[l]){
                r--;
            }else{
                l++;
            }

        }
        return max_amount;
    }
}
