class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
       int maxSize=0;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='('||temp==')'){
                if(temp=='('){
                    st.push(temp);
                    maxSize=Math.max(maxSize,st.size());
                }
                else{
                    st.pop();
                }
            }
        }
        return maxSize;
    }
}