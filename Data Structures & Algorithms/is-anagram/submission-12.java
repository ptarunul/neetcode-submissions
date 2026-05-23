class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count= new int[26];

        int s_l= s.length();
        int t_l= t.length();

        if(s_l!=t_l) return false;
        
        for(int i=0;i<s_l;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int n: count){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
