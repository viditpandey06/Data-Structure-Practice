public class RecursivePower {
    public static void main(String[] args) {
        RecursivePower obj = new RecursivePower();
        System.out.println(obj.power(2, 7));
    }
    public int power(int base, int exponent) {
        if (exponent == 1){
            return base;
        }
        else{
            int ans = power(base, exponent/2);
            ans*=ans;
            if(exponent%2==1){
                return ans*base;
            }else{
                return ans;
            }
        }
    }
}
