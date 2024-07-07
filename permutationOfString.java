/**
 * The permutationOfString class generates all possible permutations of a given string.
 */
import java.util.*;

public class permutationOfString{
    public static void main(String[] args) {
        System.out.println(generate("abcda",""));
    }
    /**
     * The function generates all possible combinations of two strings by recursively adding characters
     * from the first string to the second string.
     * 
     * @param s1 The parameter s1 is a string that represents a sequence of characters.
     * @param s2 The parameter s2 is a string that is being concatenated with each character of s1 in
     * the recursive calls.
     * @return The method is returning a List of Strings.
     */
    public static List<String> generate(String s1, String s2){
        if(s1.isEmpty()){
           List<String> aList1 = new ArrayList<>();
           aList1.add(s2+"");
           return aList1;
        }
         List<String> aList1 = new ArrayList<>();
         List<String> aList2 = new ArrayList<>();
         char ch = s1.charAt(0);
        
           
       aList1= generate(s1.substring(1), s2);
       aList2= generate(s1.substring(1), s2=s2+ch);
           
        aList1.addAll(aList2);
        return aList1;
    }
}