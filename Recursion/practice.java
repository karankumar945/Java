// Power of a number → x^n using recursion.

public class practice{
    public static int calpow(int n,int x){
        if(x == 0){
            return 1;
        }
        int nm1 = calpow(n, x-1);
        int np = n * nm1;
        return np;
    }
    public static void main(String[] args) {
        System.out.println(calpow(2, 4));
    }
}