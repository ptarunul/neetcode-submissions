class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int n= nums.length;
        int[] res= new int[n];
        int zeroCount=0;

        for(int i:nums){
            if(i==0){
                zeroCount++;
                continue;
            }
            prod*= i;
        }

        for(int i=0;i<n;i++){
            if(zeroCount==1){
                res[i]= nums[i]==0 ? prod : 0;
            }else if(zeroCount==0){
                res[i]= prod/nums[i];
            }
        }
        return res;
    }
}  
