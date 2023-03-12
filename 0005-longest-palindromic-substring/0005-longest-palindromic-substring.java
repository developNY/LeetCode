class Solution {
    public String longestPalindrome(String s) {
        String str = "";

        for(int mid=0; mid<s.length(); mid++){
            //OddPalindrome
            int l = mid, r = mid;
            String oddP = "";
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                oddP = s.substring(l, r+1);
                l--; r++;
            }
            
            //EvenPalindrome
            l=mid; r = mid+1;
            String evenP = "";
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                evenP = s.substring(l, r+1);
                l--; r++;
            }
            
            //Compare
            if(oddP.length() > evenP.length()){
                if(str.length() < oddP.length()){
                    str = oddP;
                }
            }else{
                if(str.length() < evenP.length()){
                    str = evenP;
                }
            }
        }
        
        return str;
    }
}