class Solution {
    public int minCost(String colors, int[] neededTime) {
        int l=0, r=1, time = 0;
        
        while(l<colors.length() && r<colors.length()){
            if(colors.charAt(l) != colors.charAt(r)){
                l++; r++;
            }else{
                int total = neededTime[l];
                int max = neededTime[l];
                while(l<colors.length() && r<colors.length() && colors.charAt(l) == colors.charAt(r)){
                    total += neededTime[r];
                    max = Math.max(max, neededTime[r]);
                    r++;
                }
                time += total - max;
                l = r;
                r++;
            }
        }
        
        return time;
    }
}