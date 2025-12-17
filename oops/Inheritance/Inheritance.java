// // Create a parent class Animal and child class Dog with sound() method.
// class Animal{
//     public void sound(){
//         System.out.println("Animal makes different sounds");
//     }
// }
// class Dog extends Animal{
//     @Override
//     public void sound(){
//         System.out.println("The dog makes sounds woo-woo");
//     }
// }

// public class Inheritance{
//     public static void main(String[] args) {
//         Animal a1 = new Animal();
//         a1.sound();
//         Dog d1 = new Dog();
//         d1.sound();
//     }
// }

// // Demonstrate single inheritance using Vehicle → Car.

// class car{
//     public void character(){
//         System.out.println("It makes sound zup-zup");
//     }
// }
// class Lamborghini extends car{
//     @Override
//     public void character(){
//         System.out.println("It is the fastest car in the segment");
//     }
// }
// public class Inheritance{
//     public static void main(String[] args) {
//         car c1 = new car();
//         c1.character();
//         Lamborghini l1 = new Lamborghini();
//         l1.character();
//     }
// }

// // Create a program to demonstrate multilevel inheritance: LivingBeing → Animal → Human.

// class LivingBeing{
//     public void living(){
//         System.out.println("It must inhale and exhale");
//     }
// }
// class Animal extends LivingBeing{
//     public void walk(){
//         System.out.println("Most of them genrally walks by 4 legs");
//     }
// }
// class Human extends Animal{
//     @Override
//     public void walk(){
//         System.out.println("They walk by 2 legs only");
//     }
// }
// public class Inheritance{
//     public static void main(String[] args) {
//         Animal a1 = new Animal();
//         a1.living();
//         a1.walk();
//         Human h1 = new Human();
//         h1.living();
//         h1.walk();
//     }
// }

// Create a class Bike that inherits Vehicle. Add method for mileage.

// class Vehicle{
//     public void fuel(){
//         System.out.println("Every vehicle needs fuel");
//     }
// }
// class Bike extends Vehicle{
//     public void mileage(){
//         System.out.println("Two wheelers give best mileage");
//     }
// }
// public class Inheritance{
//     public static void main(String[] args) {
//         Bike b1 = new Bike();
//         b1.fuel();
//         b1.mileage();
//     }
// }

// // Create a class Shape and child classes Circle, Square to calculate area.

// class Shape{
//     public void area(){
//         System.out.println("Every shape must have some area");
//     }
// }
// class Circle extends Shape{
//     // @Override
//     public void area(int radius){
//         double a = 2 * 3.14 * radius;
//         System.out.println("The area of cicle is = " + a);
//     }
// }
// class Square extends Shape{
//     public void area(int side){
//         int a = side * side;
//         System.out.println("The area of square is = " + a);
//     }
// }
// public class Inheritance{
//     public static void main(String[] args) {
//         Circle c1 = new Circle();
//         c1.area();
//         c1.area(5);
//         Square s1 = new Square();
//         s1.area();
//         s1.area(5);
//     }
// }