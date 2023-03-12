class Solution {
    public String longestPalindrome(String s) {
       String res = "";

       for(int i=0; i<s.length(); i++){
        // Odd Palindrome check
           int l=i, r=i;
           String oddPalindrome = "";
           while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
               oddPalindrome = s.substring(l,r+1);
               l--; r++;
           }
        // Even Palindrome check
           l=i; r=i+1;
           String evenPalindrome = "";
           while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
               evenPalindrome = s.substring(l,r+1);
               l--; r++;
           }
           String tmp = oddPalindrome.length() > evenPalindrome.length() ? oddPalindrome : evenPalindrome;
           res = res.length() > tmp.length() ? res : tmp;
        }
        return res;
    }
}