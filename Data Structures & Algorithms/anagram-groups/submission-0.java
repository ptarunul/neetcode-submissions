class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        // Process each string
        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);  // Sort the characters in the string
            String sortedStr = new String(charArr);  // Create the sorted string key

            // Add the string to the map
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        // Collect all the anagram groups
        result.addAll(map.values());

        return result;
    }
}
