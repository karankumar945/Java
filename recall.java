
import java.util.Scanner;


// import java.util.Scanner;

// // Ek method banao jo array ka maximum element return kare.

// public class recall{
    
//     public static int maxarray(int arr[]){
//         int arrmax = arr[0];
//         for(int i = 0;i < arr.length; i++){
//             if(arrmax <= arr[i]){
//                 arrmax = arr[i];
//             }
//         }
//         return arrmax;
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the length of array : -");
//         int n = sc.nextInt();
//         int arr[] =new int[n];
//         for(int i = 0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         int res = maxarray(arr);
//         System.out.println(res);
//     }
// }

// // Ek method likho jo string ko reverse kare aur return kare.

// public class recall{
    
//     public static String revstr(String str){
//         String revstr = "";
//         for(int i =str.length()-1;i>=0;i--){
//             revstr = revstr + str.charAt(i);
//         }
//         return revstr;
//     }
//     public static void main(String[] args) {
//         String revstr = revstr("Karan");
//         System.out.println(revstr);
//     }
// }

// Ek method likho jo count kare vowels in a string.

// public class recall{
//     public static int vowels(String str,int count){
//         for(int i = 0;i<=str.length()-1;i++){
//             if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
//                 str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//                     count ++;
//                 }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int coun = vowels("Tomato", 0);
//         System.out.println(coun);
//     }
// }

// Array me second largest element find karo.
public class recall{
    public static int secondmax(int arr[]){
        int max = arr[0];
        // int secmax = arr[0];
        for(int i = 0 ; i<arr.length-1; i++){
            if(max <= arr[i+1]){
                max = arr[i+1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the l of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = secondmax(arr);
        System.out.println(max);
    }
}