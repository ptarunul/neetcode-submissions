class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] res= new int[n];
        int prod=1;
        int zeroCount=0;

        for(int num:nums){
            if(num==0){
                zeroCount++;
                continue;
            }
            prod*=num;
        }

        for(int i=0;i<n;i++){
            if(zeroCount==0){
                res[i]=prod/nums[i];
            }else if(zeroCount==1){
                res[i]= nums[i]==0 ? prod : 0;
            }
        }

        return res;
    }
}  
