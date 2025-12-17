// 6a)

// import java.util.*;

// class ElectricityBill {
//     int cno;
//     String name, type;
//     double prev, curr;

//     void getData() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Consumer No: ");
//         cno = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Enter Consumer Name: ");
//         name = sc.nextLine();
//         System.out.print("Enter Previous Reading: ");
//         prev = sc.nextDouble();
//         System.out.print("Enter Current Reading: ");
//         curr = sc.nextDouble();
//         sc.nextLine();
//         System.out.print("Enter Connection Type (domestic/commercial): ");
//         type = sc.nextLine();
//     }

//     void calcBill() {
//         double units = curr - prev, amt = 0;
//         if (type.equalsIgnoreCase("domestic")) {
//             if (units <= 100) amt = units * 1;
//             else if (units <= 200) amt = 100 * 1 + (units - 100) * 2.5;
//             else if (units <= 500) amt = 100 * 1 + 100 * 2.5 + (units - 200) * 4;
//             else amt = 100 * 1 + 100 * 2.5 + 300 * 4 + (units - 500) * 6;
//         } else {
//             if (units <= 100) amt = units * 2;
//             else if (units <= 200) amt = 100 * 2 + (units - 100) * 4.5;
//             else if (units <= 500) amt = 100 * 2 + 100 * 4.5 + (units - 200) * 6;
//             else amt = 100 * 2 + 100 * 4.5 + 300 * 6 + (units - 500) * 7;
//         }
//         System.out.println("\n--- Electricity Bill ---");
//         System.out.println("Consumer No: " + cno);
//         System.out.println("Name: " + name);
//         System.out.println("Type: " + type);
//         System.out.println("Units Used: " + units);
//         System.out.println("Total Amount: ₹" + amt);
//     }
// }

// public class exp_6{
//     public static void main(String[] args) {
//         ElectricityBill e = new ElectricityBill();
//         e.getData();
//         e.calcBill();
//     }
// }

// 6b)
// import java.util.*;

// class Circle {
//     double radius;

//     void getData() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter radius of the circle: ");
//         radius = sc.nextDouble();
//     }

//     void findArea() {
//         double area = 3.14 * radius * radius;
//         System.out.println("Area of Circle = " + area);
//     }
// }

// public class exp_6 {
//     public static void main(String[] args) {
//         Circle c = new Circle();  // create object
//         c.getData();              // input radius
//         c.findArea();             // calculate and display area
//     }
// }

// 6c)

// class Address {
//     String city, state;

//     Address(String c, String s) {
//         city = c;
//         state = s;
//     }

//     void showAddress() {
//         System.out.println("City: " + city);
//         System.out.println("State: " + state);
//     }
// }

// class Student {
//     int id;
//     String name;
//     Address addr; // object of Address class as data member

//     Student(int i, String n, Address a) {
//         id = i;
//         name = n;
//         addr = a;
//     }

//     void display() {
//         System.out.println("Student ID: " + id);
//         System.out.println("Name: " + name);
//         addr.showAddress(); // using object of another class
//     }
// }

// public class exp_6 {
//     public static void main(String[] args) {
//         Address a1 = new Address("Jodhpur", "Rajasthan");
//         Student s1 = new Student(101, "Karan Kumar", a1);
//         s1.display();
//     }
// }
