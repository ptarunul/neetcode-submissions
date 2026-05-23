class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> list=new ArrayList<>();
    

        for(String str: strs){
            char[] charArr= str.toCharArray();
            Arrays.sort(charArr);
            String sorted=new String(charArr);

            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(str);
        }

        list.addAll(map.values());

        return list;        

    }
}
