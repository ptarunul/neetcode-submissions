class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r= heights.length-1;
        int maxAmount= Integer.MIN_VALUE;
        while(l<r){
            int amount= (r-l)*Math.min(heights[l], heights[r]);

            maxAmount= Math.max(amount, maxAmount);

            if(heights[r]<heights[l]){
                r--;
            }else{
                l++;
            }
        }
    return maxAmount;
    }

}
