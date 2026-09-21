class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map= new HashMap<>();
        List<List<String>> res= new ArrayList<>();

        for(String s: strs){
            char[] sorted= s.toCharArray();
            Arrays.sort(sorted);
            String ss= new String(sorted);

            map.putIfAbsent(ss, new ArrayList<>());

            map.get(ss).add(s);
        }

        res.addAll(map.values());
        return res;
    }
}
