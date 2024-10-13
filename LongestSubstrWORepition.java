 //Brute Force
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int maxLen=0;
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 String temp = s.substring(i,j+1);
//                 if(freqChecker(temp)){
//                     maxLen=Math.max(maxLen,temp.length());
//                 }
//             }
//         }
//         return maxLen;
//     }
//     private boolean freqChecker(String s){
//         HashSet<Character> hSet = new HashSet<>();
//         for(int i=0;i<s.length();i++){
//             hSet.add(s.charAt(i));
//         }
//         if(hSet.size()==s.length()){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,maxLen=0;
        HashSet<Character> hSet = new HashSet<>();
        while(r<s.length()){
            if(!hSet.contains(s.charAt(r))){
                hSet.add(s.charAt(r));
                maxLen=Math.max(maxLen,(r-l+1));
                r++;
            }
            else{
                hSet.remove(s.charAt(l));
                l++;
            }
        }
        return maxLen;
    }
}