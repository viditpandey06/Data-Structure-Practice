
import java.util.ArrayList;
import java.util.List;

public class SubsetPattern {

    public static void main(String[] args) {
        String s = "__Vidit__";
        List<String> subsetList = new ArrayList<>();
        System.out.println("List is" + subsets("", s, 0, subsetList));
    }

    public static List<String> subsets(String ans, String s, int indx, List<String> subsetList) {
        if (indx == s.length()) {
            if (ans.length() != 0 || ans.length() == 0) {
                // remove this contains condition to add repetitve string also;
                if (subsetList.contains(ans) == false) {
                    subsetList.add(ans);
                }
            }
        } else {
            subsets(ans + s.charAt(indx), s, indx + 1, subsetList);
            subsets(ans, s, indx + 1, subsetList);
        }
        return subsetList;
    }
}
