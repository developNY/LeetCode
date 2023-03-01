class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        Stack<Map<Character, Integer>> stack = new Stack<>();
        Map<Character, Integer> map = new HashMap<>();
        map.put(colors.charAt(0), neededTime[0]);
        stack.push(map);
        
        for(int i=1; i<colors.length(); i++){
            char c = colors.charAt(i);
            Map<Character, Integer> tmp = stack.peek();
            
            if(tmp.containsKey(c)){
                if(neededTime[i] < tmp.get(c)){
                    time += neededTime[i];
                }else{
                    stack.pop();
                    time+= tmp.get(c);
                    Map<Character, Integer> tmpMap = new HashMap<>();
                    tmpMap.put(c, neededTime[i]);
                    stack.push(tmpMap);
                }
            }else{
                Map<Character, Integer> tmpMap = new HashMap<>();
                tmpMap.put(c, neededTime[i]);
                stack.push(tmpMap);
            }
        }
        return time;
    }
}