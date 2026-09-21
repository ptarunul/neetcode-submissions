class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();

        int[] res= new int[k];

        List<List<Integer>> list= new ArrayList<>();

        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int i=0;i<=nums.length;i++){
            list.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            list.get(entry.getValue()).add(entry.getKey());
        }

        int index=0;

        for(int i=list.size()-1; i>0 && index<k; i--){
            for(int j:list.get(i)){
                res[index++]= j;
                if(index==k){
                    return res;
                }
            }
        }

        return res;
    }
}
