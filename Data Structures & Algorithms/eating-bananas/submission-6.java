class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k=1;
        int maxSpeed= Arrays.stream(piles).max().getAsInt();

        while(k<=maxSpeed){
            int midSpeed= k+(maxSpeed- k)/2;
            long totalTime= 0;
            for(int p:piles){
                totalTime+= Math.ceil((double)p/midSpeed);
            }

            if(totalTime<=h){
                maxSpeed= midSpeed-1;
            }else{
                k= midSpeed+1;
            }
        }
    return k;
    }

}
