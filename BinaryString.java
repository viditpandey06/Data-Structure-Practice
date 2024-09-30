public class BinaryString {
    public static void main(String[] args) {
        generate(0,50,true,"");
    }
    public static void generate(int k,int n,boolean flag,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if (n==k){
            System.out.println(str);
            return;
        }
        if(flag){
            generate(k+1,n,false,str+"1");
            generate(k+1,n,true,str+"0");
        }
        else {
            generate(k+1,n,true,str+"0");
        }
    }
}
//000 , 001 , 010 , 100 , 101
