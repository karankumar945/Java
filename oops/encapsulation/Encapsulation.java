// // Create an encapsulated class Employee with private fields and getter/setter.
// class Employee{
//     private String name;
//     private int salary;
//     // setter 
//     public void setname(String name){
//         this.name = name;
//     }
//     public void setsalary(int salary){
//         this.salary = salary;
//     }  
//     // getter
//     public String getname(){
//         return name;
//     }
//     public int getsalary(){
//         return salary;
//     }
  
//     public void display(){
//         System.out.println("Name of employee = "+getname());
//         System.out.println("Salary of employee = " + getsalary());
//     }
// }
// public class Encapsulation{
//     public static void main(String[] args) {
//         Employee e1 = new Employee();
//         e1.setname("Karan Kumar");
//         e1.setsalary(75000);
//         e1.display();
//     }
// }

// // Create a class Account where balance cannot be set below 0 using setter validation.

// class Account{
//     private String name;
//     private int balance;

//     // setter
//     public void setname(String name){
//         this.name = name;
//     }
//     public void setbalance(int balance){
//         if(balance > 0){
//             this.balance = balance;
//         }
//         else{
//             System.out.println("Your balance is not sets");
//         }
//     }
//     // getter
//     public String getname(){
//         return name;
//     }
//     public int getbalance(){
//         return balance;
//     }
//     public void display(){
//         System.out.println("name = " + name);
//         System.out.println("Balance = " + balance);
//     }
// }

// public class Encapsulation{
//     public static void main(String[] args) {
//         Account a1 = new Account();
//         a1.setname("Namo");
//         a1.setbalance(0);
//         a1.display();
//     }
// }

// // Create encapsulation example where password cannot be accessed directly.

// class google{
//     private int password;

//     public void setpassword(int password){
//         this.password = password;
//     }

//     public int getpassword(){
//         return password;
//     }
//     public void display(){
//         System.out.println("password is : - " + password);
//     }
// }

// public class Encapsulation{
//     public static void main(String[] args) {
//         google g1 = new google();
//         g1.setpassword(7930);
//         g1.display();
//     }
// }

// // Create a class User where age must be between 18–60 and enforce through setter.
// class User{
//     String name;
//     private int age;

//     public User(String name) {
//         this.name = name;
//     }
//     public void setage(int age){
//         if(age >= 18 && age <=60){
//             this.age = age;
//         }
//         else{
//             System.out.println("Not valid age");
//         }
//     }
//     public int getage(){
//         return age;
//     }
//     public void display(){
//         System.out.println("name = " + name);
//         System.out.println("age = " + age);
//     }
// }
// public class Encapsulation{
//     public static void main(String[] args) {
//         User u1 = new User("Lakhan");
//         u1.setage(17);
//         u1.display();
//     }
// }

// // Create a class Laptop with private brand and price and print using getter.

// class Laptop{
//     private String brand;
//     private int price;

//     public void setbrand(String brand){
//         this.brand = brand;
//     }
//     public void setprice(int price){
//         this.price = price;
//     }
//     public String getbrand(){
//         return brand;
//     }
//     public int getprice(){
//         return price;
//     }
//     public void display(){
//         System.out.println("brand = " + brand);
//         System.out.println("price = " + price);
//     }
// }
// public class Encapsulation{
//     public static void main(String[] args) {
//         Laptop l1 = new Laptop();
//         l1.setbrand("Asus");
//         l1.setprice(65000);
//         l1.display();
        
//     }
// }