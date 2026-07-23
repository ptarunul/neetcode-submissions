class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);

        if(nums.length==0) return 0;

        // int j=0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[j]){
        //         nums[++j]=nums[i];
        //     }
        // }
        Set<Integer> set=new TreeSet<>();
        
        for(int num: nums){
            set.add(num);
        }

        int[] sortedArr= set.stream().mapToInt(Integer::intValue).toArray();

        int seqLen=1;

        // for(int i=0;i<sortedArr.length;i++){
        //     int k=i;
        //     int p=k+1;

        //     while(p<sortedArr.length && sortedArr[k]+1==sortedArr[p]){
        //         k++;
        //         p++;
        //     }
        //     int len=p-i;

        //     seqLen=Math.max(seqLen,len);
        // }     
        int len=1;
        for(int i=0;i<sortedArr.length-1;i++){
            if(sortedArr[i]+1==sortedArr[i+1]){
                len++;
                seqLen=Math.max(seqLen,len);
            }else{
                len=1;
            }
        }

        return seqLen;   
    }
}
