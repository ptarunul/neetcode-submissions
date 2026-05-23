class Solution {
    public boolean isAnagram(String s, String t) {

        int[] freq= new int[26];

        for(int s_char:s.toCharArray()){
            freq[s_char-'a']++;
        }

        for(int t_char:t.toCharArray()){
            freq[t_char-'a']--;
        }

        for(int f:freq){
            if(f!=0) return false;
        }

        return true;


    }
}
