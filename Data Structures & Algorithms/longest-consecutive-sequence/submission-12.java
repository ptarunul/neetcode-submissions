class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length==0) return 0;
        // Arrays.sort(nums);
        // int n= nums.length;

        // int j=0;
        // for(int i=1;i<n;i++){
        //     if(nums[j]!=nums[i]){
        //         nums[++j]=nums[i];
        //     }
        // }

        // int[] sorted= Arrays.copyOf(nums, j+1);

        // int seqLen= 1;

        // for(int i=0;i<sorted.length;i++){
        //     int k=i;
        //     int p=k+1;

        //     while(p<sorted.length && sorted[k]+1==sorted[p]){
        //         k++;
        //         p++;
        //     }

        //     int len= p-i;

        //     seqLen= Math.max(seqLen, len);
        // }

        // return seqLen;
        



        if(nums.length==0) return 0;

        Set<Integer> set=new TreeSet<>();
        
        for(int num: nums){
            set.add(num);
        }

        int[] sortedArr= set.stream().mapToInt(Integer::intValue).toArray();

        int seqLen=1;

     
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
