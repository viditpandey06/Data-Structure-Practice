class Solution {
    public String longestPalindrome(String s) {
        int maxLen=-1;
        String maxStr="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String temp =s.substring(i,j+1);
                if(isPalin(temp)){
                    System.out.println(temp);
                    if(maxLen<temp.length()){
                        maxLen=temp.length();
                        maxStr=temp;
                    }
                }
            }
        }
        return maxStr;
    }
    private boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        int cntr=0;
        if(j==0){
            return true;
        }
        else{
            while(i<=j){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                }
                else{
                    return false;
                }
            }
            return true;
        }
    }
}