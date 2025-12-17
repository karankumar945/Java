
// REVERSING THE STRING BY RECURSION
// import java.util.Scanner;

// public class string_reverse{
//     public static void rev(String str , int i){
//         if(i == 0){
//             System.out.println(str.charAt(i));
//             return;
//         }
//         System.out.println(str.charAt(i));
//         rev(str, i-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string:-");
//          String line=sc.nextLine();
//         System.out.println("Enter the string length");
//        int len=sc.nextInt();
//         rev(line, len);
//     }
// }

// FINDING THE FIRST AND LAST OCCURENCE OF THE STRING

// public class string_reverse{
//     static int first = -1;
//     static int last = -1;
//     public static void occ(String str,char key,int i){
//         if(i == str.length()){
//         System.out.println(first);
//         System.out.println(last);
//         return;
//         }
//         char currchar = str.charAt(i);
//         if(currchar == key){
//             if(first == -1){
//                 first = i;
//             }
//             else{
//                 last = i;
//             }
//         }
//         occ(str, key, i+1);
//     }
//     public static void main(String[] args) {
//         String str= "abaacdaefaah";
//         char key= 'a';
//         occ(str, key, 0);
//     }
// }

// CHECKING THE ARRAY IS STRICTLY INCREASING OR NOT

// public class string_reverse{
//     public static boolean inc(int arr[],int idx){
//         if(idx == arr.length-1){
//             return true;
//         }
//         if(arr[idx] >= arr[idx+1]){
//             return false;
//         }
//         return inc(arr, idx+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7};
//         System.out.println(inc(arr, 0));
//     }
// }

// MOVE ALL 'X' TO THE END OF THE STRING axbcxxd

// public class string_reverse{
//     public static void doen(String str,int idx,int count, String newstr){
//         if(idx == str.length()){
//             for(int i = 0 ; i < count ; i++){
//                 newstr += 'x';
//             }
//             System.out.println(newstr);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if(currchar == 'x'){
//             count++;
//             doen(str, idx+1,count, newstr);
//         }
//         else{
//             newstr+= currchar;
//             doen(str, idx+1, count, newstr);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         String newstr = " ";
//         doen(str, 0, 0, newstr);        
//     }
// }

// REMOVE ALL DUPLICATES FROM THE STRING

// public class string_reverse{
//     public static boolean map[] = new boolean[26];
//     public static void removedup(String str,int idx, String newstr){
//         if(idx == str.length()){
//             System.out.println(newstr);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if(map[currchar-'a'] == true){
//             removedup(str, idx+1, newstr);
//         }else{
//             newstr += currchar;
//             map[currchar - 'a'] = true;
//             removedup(str, idx+1, newstr);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "karankumar";
//         removedup(str,0, " ");
//     }
// }

