class Solution
{
    long substrCount (String s, int k1) {
        // your code here
        int cnt=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String temp = s.substring(i,j+1);
                HashSet<Character> hSet = new HashSet<>();
                for(int k=0;k<temp.length();k++){
                    hSet.add(temp.charAt(k));
                }
                if(hSet.size()==k1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}