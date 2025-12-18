// // Write a class Car with properties brand, model, and year. Create objects and print details.
// class car{
//     String brand;
//     String model;
//     int year;

//     car(String brand,String model,int year){
//         this.brand = brand;
//         this.model = model;
//         this.year = year;
//     }
//     public void display(){
//         System.out.println("Brand. :- " + brand);
//         System.out.println("Model  :-" + model);
//         System.out.println("Year.  :-" + year);
//         System.out.println("It runs very fast");
//     }
// }
// public class oops{
//     public static void main(String[] args) {
//         car c1 = new car("Lamborghini","Avendator",2024);
//         car c2 = new car("Ferari", "Gloster", 2021);
//         c1.display();
//         c2.display();
//     }
// }

// // Create a class Student with attributes name, roll number, and marks. Add a method to display student details.

// class Student{
//     String name;
//     int roll_no;
//     double marks;

//     public Student(String name, int roll_no, double marks) {
//         this.name = name;
//         this.roll_no = roll_no;
//         this.marks = marks;
//     }

//     public void display(){
//         System.out.println("Name : - " + name);
//         System.out.println("Roll Number : - " + roll_no);
//         System.out.println("Marks : - " + marks);
//     }
// }
// public class oops{
//     public static void main(String[] args) {
//             Student s1 = new Student("Karan", 65, 89.98);
//             Student s2 = new Student("Namo", 15, 87.89);
//             s1.display();
//             s2.display();
//     }
// }

// // Write a program to demonstrate constructor in a class Mobile.

// class Mobile{
//     String Brand;
//     String sim;
//     int cost;

//     Mobile(String Brand, String sim, int cost){
//         this.Brand = Brand;
//         this.sim = sim;
//         this.cost = cost;
//     }
//          public void display(){
//         System.out.println("Brand : - " + Brand);
//         System.out.println("Sim : - " + sim);
//         System.out.println("Cost : - " + cost);
//     }
// }
// public class oops{
//     public static void main(String[] args) {
//         Mobile m1 = new Mobile("Samsung", "Jio", 24000);
//         m1.display();
//     }
// }

// // Create a class Person with a default constructor and parameterized constructor. Print values from both.

// class Person{
//     String name;
//     String color;
//     int age;

//     Person() {
//         name = "Karan";
//         color = "Light";
//         age = 20;
//     }

//     Person(String name, String color, int age) {
//         this.name = name;
//         this.color = color;
//         this.age = age;
//     }
//     public void display(){
//         System.out.println("Name = " + name);
//         System.out.println("Color = " + color);
//         System.out.println("Age = " + age);
//     }
// }
// public class oops{
//     public static void main(String[] args) {
//         Person p1 = new Person();
//         Person p2 = new Person("Namo", "Glowy", 19);
//         p1.display();
//         p2.display();
//     }
// }

// // Create a class Book and update its price using setter method and print using getter.

// class Book{
//     private double price;
//     private String title;
// // setter method
//     public void setprice(double price) {
//         this.price = price;
//     }
//     public void settitle(String title){
//         this.title = title;
//     }
// // getter method
//     public double getprice(){
//         return price;
//     }
//     public String gettitle(){
//         return title;
//     }
// }
// public class oops{
//     public static void main(String[] args) {
//         Book b1 = new Book();
//         b1.settitle("Hercules");
//         b1.setprice(89.90);
//         System.out.println("The Book title is = " + b1.gettitle());
//         System.out.println("The price is = " + b1.getprice());
//     }
// }

class Bank{
    private int balance;

    public void getbalance(int balance){
        this.balance = balance;
    }
    public int setbalance(){
        return balance;
    }
    public void display(){
        System.out.println(setbalance());
    }
    
}
public class oops{
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.getbalance(89000);
        b1.setbalance();
        b1.display();
        Bank b2 = new Bank();
        b2.getbalance(90000);
        b2.setbalance();
        b2.display();
    }
}