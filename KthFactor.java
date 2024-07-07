import java.util.ArrayList;
import java.util.List;

public class KthFactor {
    public static void main(String[] args) {
        int n = 10;
        int k = 2;
        System.out.println(factor(n, k));
    }

    public static int factor(int n, int k) {
        List<Integer> aList1 = new ArrayList<>(null);
        List<Integer> aList2 = new ArrayList<>(null);
        List<Integer> aList3 = new ArrayList<>(null);
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                aList1.add(i);
                aList2.add(n / i);
            }

        }
        aList3.addAll(aList1);
        aList3.addAll(aList2);
        for (int i = 0; i < aList3.size() - 1; i++) {
            if (aList3.get(i) == aList1.get(i + 1))
                ;
            {

            }
        }
        return 0;
    }
}
