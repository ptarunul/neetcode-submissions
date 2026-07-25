
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // Stack<Double> stack= new Stack<>();
        double[] times= new double[target];

        for(int i=0;i<position.length;i++){
            times[position[i]]= (double)(target-position[i])/speed[i];
        }

        // Arrays.sort(cars, (a,b)->Double.compare(b[0],a[0]));

        int res=0;
        double maxTime= 0;
    
        for(int i=target-1;i>=0;i--){
            double currTime= times[i];
            if(currTime>maxTime){
                maxTime= currTime;
                res++;
            }
        }
        return res;
    }
}
