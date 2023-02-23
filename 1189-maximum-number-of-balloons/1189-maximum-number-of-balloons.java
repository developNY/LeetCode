class Solution {
    public int maxNumberOfBalloons(String text) {
        int res = text.length();
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getKey() == 'b' || e.getKey() == 'a' || e.getKey() == 'n')
                res = Math.min(res, map.get(e.getKey()));
            else if(e.getKey() == 'l' || e.getKey() == 'o')
                res = Math.min(res, map.get(e.getKey())/2);
        }
        return res;
    }
}