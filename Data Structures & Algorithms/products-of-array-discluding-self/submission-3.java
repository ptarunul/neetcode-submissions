class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        // Arrays.fill(ans,0);
        int product=1;
        int zeroCount=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeroCount++;
                continue;
            }
            product*=nums[i];
        }

        if(zeroCount==1){
            for(int i=0;i<n;i++){
                ans[i]= nums[i]==0?product: 0;
            }
        }else if(zeroCount==0){
            for(int i=0;i<n;i++){
                ans[i]=product/nums[i];
            }
        }

        return ans;
    }
}