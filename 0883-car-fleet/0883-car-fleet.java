class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet = 0;
        double[] timeArr = new double[target];

        for(int i=0; i<position.length; i++)
            timeArr[position[i]] = (double) (target - position[i]) / speed[i];

        double prev = 0.0;
        for(int i=target-1; i>=0; i--){
            if(prev < timeArr[i]){
                prev = timeArr[i];
                fleet++;
            }
        }

        return fleet;
    }
}