class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        int[] res= new int[2];
        int n=numbers.length;

        for(int i=0; i<n; i++){
            int diff= target-numbers[i];

            if(map.containsKey(diff)){
                res[0]=map.get(diff);
                res[1]=i+1;
            }else{
                map.put(numbers[i],i+1);
            }
        }
        return res;
}
}
