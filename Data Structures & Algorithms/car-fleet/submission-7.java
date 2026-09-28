
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[] times= new double[target];
        int count=0;

        for(int i=0; i<position.length; i++){
            times[position[i]]= (double)(target-position[i])/speed[i];
        }

        double maxTime=0;
        for(int i=target-1; i>=0; i--){
            double currTime= times[i];
            if(currTime>maxTime){
                maxTime= currTime;
                count++;
            }
        }
        return count;
    }       
}
