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
// // Array me second largest element find karo.
// public class recall{
//     public static int secondmax(int arr[]){
//         int max = arr[0];
//         // int secmax = arr[0];
//         for(int i = 0 ; i<arr.length-1; i++){
//             if(max <= arr[i+1]){
//                 max = arr[i+1];
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the l of array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = secondmax(arr);
//         System.out.println(max);
//     }
// }
// // Array me majority element find karo (> n/2 times).
// public class recall{
//     public static int majority(int arr[],int n){
//         for(int i = 0;i < arr.length;i++){
//             if(arr[i] > n/2){
//                 System.out.println(arr[i]);
//             }
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 5;
//         int arr[] = new int[n];
//         for(int i= 0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         majority(arr, n);
//     }
// }
// Array ko reverse karo (without extra array).
// public class recall{
//     public static void reverse(int arr[],int n){
//         int i = 0;
//         int j = n-1;
//         while(i<j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//         for(int k=0;k<n;k++){
//             System.out.println(arr[k]);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the l of array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         reverse(arr, n);
//     }
// }
// Array ka sum find karo.
// public class recall{
//     public static int sum(int arr[]){
//         int add = 0;
//         for(int i=0;i<arr.length;i++){
//             add += arr[i];
//         }
//         return add;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the l of array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         int res = sum(arr);
//         System.out.println(res);
//     }
// }
// public class recall{
//     public static void main(String[] ars){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t>0){
//             int add = 0;
//             int red = 0;
//             int tc;
//             int n = sc.nextInt();
//             int prices[] = new int[n];
//             int x = sc.nextInt();
//             int y = sc.nextInt();
//             for(int i = 0;i<n;i++){
//                 prices[i] = sc.nextInt();
//             }
//             // add
//             for(int i = 0;i<n;i++){
//                 add += prices[i];
//             }
//             // reducing value
//             for(int i =0;i<n;i++){
//                 if(prices[i] <= y){
//                     prices[i] = 0;
//                 }
//                 else{
//                     prices[i] = prices[i] - y;
//                 }
//             }
//             for(int i = 0;i <n;i++){
//                 red += prices[i];
//             }
//             tc = red + x;
//             if(tc < add){
//                 System.out.println("COUPON");
//             }
//             else{
//                 System.out.println("NO COUPON");
//             }
//             t--;
//         }  
//     }
// }
// public class recall{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int heightarr[] = new int[n];
//         for(int i = 0 ; i<n ;i++){
//             heightarr[i] = sc.nextInt();
//         }
//         int maxarea = 0;
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<n;j++){
//                 int width = j - i;
//                 int height = Math.min(heightarr[j],heightarr[i]);
//                 int area = height * width;
//                 maxarea = Math.max(maxarea, area);
//             }
//         }
//         System.out.println(maxarea);
//     }
// }
// public class recall {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = {0,1,2,2,3,0,4,2};
//         int count = 0;
//         int val = sc.nextInt();
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != val) {
//                 arr[count] = arr[i];
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }


// class Solution {
//     public void nextPermutation(int[] nums) {
//         int n = nums.length;
//         int i = n - 2;

//         // Step 1: find breakpoint
//         while (i >= 0 && nums[i] >= nums[i + 1]) {
//             i--;
//         }

//         // Step 2: if breakpoint exists
//         if (i >= 0) {
//             int j = n - 1;
//             while (nums[j] <= nums[i]) {
//                 j--;
//             }
//             swap(nums, i, j);
//         }

//         // Step 3: reverse suffix
//         reverse(nums, i + 1, n - 1);
//     }

//     void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             swap(nums, start, end);
//             start++;
//             end--;
//         }
//     }
// }

// rotating array by indexing
public class recall{
    public static void revarr(int arr[],int target,int valuefind){
        int n = arr.length;
        target = target % n;
        int temp[] = new int[n];
        int count = 0;
        int indexing = -1;
        for(int i=target;i<n;i++){
            temp[count++] = arr[i];
        }
        for(int i = 0;i<target;i++){
            temp[count++] = arr[i];
        }
        for(int i = 0;i<n;i++){
            arr[i] = temp[i];
        }
        for(int i = 0;i<n;i++){
            if(arr[i] == valuefind){
                indexing = i;
                break;
            }
        }
        System.out.println(indexing);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = {0,1,2,4,5,6,7};
        int target = 3;
        int indexing = 0;
        revarr(arr, target,indexing);
    }
}
