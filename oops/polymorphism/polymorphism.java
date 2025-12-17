// // Create method overriding: Class Animal has sound() and subclass Dog overrides it.

// class Animal{
//     public void sound(){
//         System.out.println("All animal make different sounds");
//     }
// }
// class dog extends Animal{
//     @Override
//     public void sound(){
//         System.out.println("The dog makes woo-woo");
//     }
// }
// public class polymorphism{
//     public static void main(String[] args) {
//         Animal obj;
//         obj = new Animal();
//         obj.sound();

//         obj  = new dog();
//         obj.sound();
//     }
// }

// // Demonstrate method overloading to calculate area of circle and rectangle.

// class circle{
//     public double area(int radius){
//         double a = 2 * 3.14 * radius;
//         return a;
//     }
// }
// class rectangle{
//     public double area(int length , int breadth){
//         int a = 2 * length * breadth;
//         return a;
//     }
// }
// public class polymorphism{
//     public static void main(String[] args) {
//         circle c1 = new circle();
//         System.out.println("The area of circle is : "+ c1.area(5));
//         rectangle r1 = new rectangle();
//         System.out.println("The area of rectangle is : " + r1.area(2, 7));
//     }
// }

// // Create an example to show runtime polymorphism using vehicle type selection.

// class vehicle{
//     public void features(int speed){
//         System.out.println("The speed of this vehicle is : - " + speed);
//     }
// }
// class car extends vehicle{
//     @Override
//     public void features(int speed){
//         System.out.println("The speed of car is high : - " + speed);
//     }
// }
// public class polymorphism{
//     public static void main(String[] args) {
//         vehicle v;
//         v = new car();
//         v.features(280);
//     }
// }

// // Write a program to show method overriding using Bank → SBI, ICICI, HDFC.

// class Bank{
//     public void interestrate(){
//         System.out.println("Every bank has interest rate above 5%");
//     }
// }
// class SBI extends Bank{
//     @Override
//     public void interestrate(){
//         System.out.println("It has interest rate of 7.5%");
//     }
// }
// class ICICI extends SBI{
//     @Override
//     public void interestrate(){
//         System.out.println("It has interest rate of 8%");
//     }
// }
// class HDFC extends ICICI{
//     @Override
//     public void interestrate(){
//         System.out.println("It has interest rate of 9%");
//     }
// }
// public class polymorphism{
//     public static void main(String[] args) {
//         Bank b;
//         b = new SBI();
//         b.interestrate();
//         b = new ICICI();
//         b.interestrate();
//         b = new HDFC();
//         b.interestrate();
//     }
// }

// // Implement a function sum() that works for 2 numbers and 3 numbers using method overloading.

// class math{
//     public void sum(int a,int b){
//         int add = a + b;
//         System.out.println("add : - " + add);
//     }
//         public void sum(int a,int b,double c){
//         double add = a + b + c;
//         System.out.println(" double add : - " + add);
//     }
// }
// public class polymorphism{
//     public static void main(String[] args) {
//         math m1 = new math();
//         m1.sum(5, 7);
//         m1.sum(3, 2, 9.8);
//     }
// }