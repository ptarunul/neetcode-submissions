class Solution {
    public boolean isPalindrome(String s) {
        String input= s.toLowerCase().replaceAll("[^a-z0-9]","");
        // System.out.println
        int i=0,j=input.length()-1;

        while(i<=j){
            if(input.charAt(i)==input.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
