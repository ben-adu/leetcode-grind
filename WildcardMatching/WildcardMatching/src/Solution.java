public class Solution {
    public boolean isMatch(String s, String p) {
        int str1= s.length();
        int str2 = p.length();
        int strMin =Math.min(str1, str2);

        for(int i=0; i<strMin; i++){
            if (s == p){
                return true;
            }
            
        }
        
        return true;
        
    }
    
}
