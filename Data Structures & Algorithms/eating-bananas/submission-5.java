class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed= 1;
        int maxSpeed= Arrays.stream(piles).max().getAsInt();

        while(minSpeed<=maxSpeed){
            int mid= minSpeed+(maxSpeed-minSpeed)/2;
            long totalTime=0;

            for(int pile:piles){
                totalTime+=Math.ceil((double)pile/mid);
            }

            if(totalTime<=h){
                maxSpeed= mid-1;
            }else{
                minSpeed= mid+1;
            }
        }

        return minSpeed;
    }
}
