class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        Map<String, List<String>> map= new HashMap<>();

        for(String s: strs){
            char[] charArr= s.toCharArray();
            Arrays.sort(charArr);
            String sortedArray= new String(charArr);

            map.putIfAbsent(sortedArray, new ArrayList<>());
            map.get(sortedArray).add(s);
        }

        res.addAll(map.values());

        return res; 
    }
}
