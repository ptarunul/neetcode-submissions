class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        int[] res= new int[k];
        List<List<Integer>> freq= new ArrayList<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int i=0;i<nums.length+1;i++){ 
            freq.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            freq.get(entry.getValue()).add(entry.getKey());
        }

        int index=0;

        for(int i=freq.size()-1; i>0 && index<k; i--){
            for(int j:freq.get(i)){
                res[index++]=j;
                if(index==k){
                    return res;
                }
            }
        }

        return res;
    }
}
