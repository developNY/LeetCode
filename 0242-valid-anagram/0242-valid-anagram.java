class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            mapS.put(c, mapS.getOrDefault(c, 0)+1);
        }
        
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            mapT.put(c, mapT.getOrDefault(c, 0)+1);
        }
        
        for(Map.Entry<Character, Integer> e : mapS.entrySet()){
            if(!mapT.containsKey(e.getKey()) || !mapT.get(e.getKey()).equals(e.getValue()))
                return false;            
        }
        return true;
    }
}