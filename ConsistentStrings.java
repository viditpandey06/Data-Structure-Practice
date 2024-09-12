public class ConsistentStrings {
    public static void main(String[] args){
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        System.out.println(countConsistentStrings(allowed, words));
    }
    public int countConsistentStrings(String allowed, String[] words) {
    int ctr=0;
    for(int i=0;i<words.length;i++){
        String word=words[i];
        for(int j=0;j<word.length();j++){
            if(allowed.indexOf(word.charAt(j))==-1){
                break;
            }
            if(j==word.length()-1){
                ctr++;
            }
        }

    }
    return ctr;

}
