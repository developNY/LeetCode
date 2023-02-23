class Solution {
    public int maxNumberOfBalloons(String text) {
        int res = text.length();
        int[] alpha = new int[26];
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            alpha[c-'a']++;
        }
        res = Math.min(res, alpha['b'-'a']);
        res = Math.min(res, alpha['a'-'a']);
        res = Math.min(res, alpha['l'-'a']/2);
        res = Math.min(res, alpha['o'-'a']/2);
        res = Math.min(res, alpha['n'-'a']);
        return res;
    }
}