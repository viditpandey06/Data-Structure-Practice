class Solution {
    public boolean isIso(String s, String t) {
        HashMap<Character, Character> hMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char temp1 = s.charAt(i);
            char temp2 =t.charAt(i);
            if (hMap.containsKey(temp1)) {
                if (hMap.get(temp1)!=temp2 ) {
                    return false;
                }
            }
             else {
                hMap.put(temp1,temp2);
            }
        }
        return true;
    }
       public boolean isIsomorphic(String s, String t) {
        
            return (isIso(s,t) && isIso(t,s));// i have to check in both ways from s->t and t->s

       
    }

}