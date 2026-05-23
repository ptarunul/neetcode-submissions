class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        // Set<Integer> set=new TreeSet<>();

        if(nums.length==0) return 0;
        
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                nums[++j]=nums[i];
            }
        }

        int[] sortedArr= Arrays.copyOf(nums,j+1);

        int seqLen=1;

        for(int i=0;i<sortedArr.length;i++){
            int k=i;
            int p=k+1;

            while(p<sortedArr.length && sortedArr[k]+1==sortedArr[p]){
                k++;
                p++;
            }
            int len=p-i;

            seqLen=Math.max(seqLen,len);
        }     

        return seqLen;   
    }
}
