
// import java.util.Scanner;



// public class array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the array size:-");
//         int size=sc.nextInt();
//         int arr[]=new int [size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Your array is:-");
//         for(int i=0;i<size;i++){
//             System.err.println(arr[i]);
//         }
//     }
// }

// Write a java program that identifies the even element in two array and creates third array:-
// public class array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length of array:-");
//         int n=sc.nextInt();
//         int arr1[]=new int[n];
//                 for(int i=0;i<n;i++){
//             arr1[i]=sc.nextInt();
//         }
//         System.out.println("Enter the length of element:-");
//         int y=sc.nextInt();
//         int arr2[]=new int[y];
//         int arr3[]=new int[n+y];

//         for(int i=0;i<y;i++){
//             arr2[i]=sc.nextInt();
//         }
// //    checking even
// int index=0;
//         for(int i=0;i<n;i++){
//             if(arr1[i]%2==0){
//                 arr3[index++]=arr1[i];
//             }
//         }
//                 for(int i=0;i<y;i++){
//             if(arr2[i]%2==0){
//                     arr3[index++]=arr2[i];
                
//             }
//         }
//         // printing even array
//         System.out.println("The even array is:-");
//         for(int i=0;i<index;i++){
//             System.out.println(arr3[i]);
//         }
//     }
// }
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length of an array:-");
//         int n=sc.nextInt();
//         int arr[]=new int[n+1];
//         // taking input
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the index to enter:-");
//         int index=sc.nextInt();
//         System.out.println("Enter the element to enter:-");
//         int e=sc.nextInt();
//         for(int i=n;i>index;i--){
//             arr[i]=arr[i-1];
//         }
//         arr[index]=e;
//         for(int i=0;i<n+1;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


// Making two matrix and sum of it:-

// public class array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.err.println("Enter the length of a row:-");
//         int row=sc.nextInt();
//         System.out.println("Enter the column of a row:-");
//         int column=sc.nextInt();
//         int matrix[][]=new int[row][column];
//         int matrix2[][]=new int[row][column];
//         int add[][]=new int[row][column];
//         // input in first matrix
//         System.out.println("Enter the elements for 1st matrix:-");
//         for(int i=0;i<=row-1;i++){
//             for(int j=0;j<=column-1;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         // input in second matrix
//         System.err.println("Enter the elements for 2nd matrix:-");
//         for(int i=0;i<=row-1;i++){
//             for(int j=0;j<=column-1;j++){
//                 matrix2[i][j]=sc.nextInt();
//             }
//         }
//         // adding two matrix
//         for(int i=0;i<=row-1;i++){
//             for(int j=0;j<=column-1;j++){
//                 add[i][j]=matrix[i][j]+matrix2[i][j];
//             }
//         }
//         // 
//         for(int i=0;i<=row-1;i++){
//             for(int j=0;j<=column-1;j++){
//                 System.out.print(add[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }
// }

