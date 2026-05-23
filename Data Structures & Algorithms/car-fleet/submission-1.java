
// class Solution {
//     public int carFleet(int target, int[] position, int[] speed) {
//         int n = position.length;
//         double[][] cars = new double[n][2];

//         for (int i = 0; i < n; i++) {
//             cars[i][0] = position[i];
//             cars[i][1] = (double)(target - position[i]) / speed[i];
//         }

//         Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

//         int fleets = 0;
//         double maxTime = 0;

//         for (int i = 0; i < n; i++) {
//             if (cars[i][1] > maxTime) {
//                 fleets++;
//                 maxTime = cars[i][1];
//             }
//         }
//         return fleets;
//     }
// }
public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        int fleets = 1;
        double prevTime = (double)(target - pair[0][0]) / pair[0][1];
        for (int i = 1; i < n; i++) {
            double currTime = (double)(target - pair[i][0]) / pair[i][1];
            if (currTime > prevTime) {
                fleets++;
                prevTime = currTime;
            }
        }
        return fleets;
    }
}