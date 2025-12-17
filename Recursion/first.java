// public class first {

//     public static int calfibbo(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         return calfibbo(n - 1) + calfibbo(n - 2);
//     }

//     public static void main(String[] args) {
//         int n = 10; // You can change this to any number
//         System.out.println("Fibonacci series up to " + n + " terms:");

//         for (int i = 0; i < n; i++) {
//             System.out.print(calfibbo(i) + " ");
//         }
//     }
// }


// public class first{
//     public static void printnum(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printnum(n-1);
//     }
//     public static void main(String[] args) {
//         int n=6;
//         printnum(n);
//     }
// }

// public class first{
//     public static void printnumb(int n){
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         printnumb(n+1);
//     }
//     public static void main(String[] args) {
//         int n=1;
//         printnumb(n);
//     }
// }

// public class first{
//     public static int printsum(int i,int n, int sum){
//         if(i==n){
//             sum+=n;
//             System.out.println(sum);
//             return 0;
//         }
//         sum+=i;
//         printsum(i+1, n, sum);
//         return 0;
//     }
//     public static void main(String[] args) {
//         printsum(1, 5, 0);
//     }
// }

// public class first{
//     public static int calfact(int n){
//         if(n==1){
//             return 1;
//         }
//         int factnm1=calfact(n-1);
//         int fact=n*factnm1;
//         calfact(n-1);
//         return fact;
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int result=calfact(n);
//         System.out.println(result);
//     }
// }

// fibbonacci sequence:-

// public class first{
//     public static int calfibbo(int a,int b,int n){
//         if(n==0){
//             return 0;
//         }
//          int c=a+b;
//          System.out.println(c);
//          calfibbo(b, c, n-1);
//          return 0;
//     }
//     public static void main(String[] args) {
//         int a=0;
//         int b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         calfibbo(a, b, n-2);

//     }
// }

// Calculate power of x to power of n

// public class first{
//     public static int calpow(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         return x*calpow(x, n-1);
//     }
//     public static void main(String[] args) {
//         int x=2;
//         int n=3;
//         int result=calpow(x, n);
//         System.out.println(result);
//     }
// }