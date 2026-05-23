class Solution {
    public boolean isPalindrome(String s) {
        String modStr= s.toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.println(modStr);
        
        int i=0;
        int j=modStr.length()-1;
        
        while(i<=j){
            if(modStr.charAt(i)==modStr.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
