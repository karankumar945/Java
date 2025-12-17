// class Student {
//     int id;
//     String name;

//     // Default (no-parameter) constructor
//     Student() {
//         id = 0;
//         name = "Unknown";
//     }

//     // Parameterized constructor
//     Student(int i, String n) {
//         id = i;
//         name = n;
//     }

//     void display() {
//         System.out.println("ID: " + id + ", Name: " + name);
//     }
// }

// public class exp_7{
//     public static void main(String[] args) {
//         Student s1 = new Student();               // calls default constructor
//         Student s2 = new Student(101, "Karan");   // calls parameterized constructor

//         s1.display();
//         s2.display();
//     }
// }


// class Student {
//     int id;
//     String name;

//     // Default constructor
//     Student() {
//         id = 101;
//         name = "Karan Kumar";
//     }

//     void display() {
//         System.out.println("Student ID: " + id);
//         System.out.println("Student Name: " + name);
//     }
// }

// public class exp_7{
//     public static void main(String[] args) {
//         Student s = new Student(); // default constructor is called
//         s.display();
//     }
// }


// class Student {
//     int id;
//     String name;

//     // Parameterized constructor
//     Student(int i, String n) {
//         id = i;
//         name = n;
//     }

//     void display() {
//         System.out.println("Student ID: " + id);
//         System.out.println("Student Name: " + name);
//     }
// }

// public class exp_7{
//     public static void main(String[] args) {
//         // Object creation with parameters
//         Student s1 = new Student(101, "Karan Kumar");
//         Student s2 = new Student(102, "Amit Singh");

//         s1.display();
//         s2.display();
//     }
// }


// class Student {
//     int id;
//     String name;

//     // Parameterized constructor
//     Student(int i, String n) {
//         id = i;
//         name = n;
//     }

//     // Copy constructor
//     Student(Student s) {
//         id = s.id;
//         name = s.name;
//     }

//     void display() {
//         System.out.println("Student ID: " + id);
//         System.out.println("Student Name: " + name);
//     }
// }

// public class exp_7{
//     public static void main(String[] args) {
//         Student s1 = new Student(101, "Karan Kumar"); // original object
//         Student s2 = new Student(s1);                 // copy object

//         System.out.println("Original Student:");
//         s1.display();

//         System.out.println("\nCopied Student:");
//         s2.display();
//     }
// }


// class Student {
//     int id;
//     String name;

//     // Default constructor
//     Student() {
//         id = 0;
//         name = "Unknown";
//     }

//     // Parameterized constructor with one parameter
//     Student(int i) {
//         id = i;
//         name = "Not Provided";
//     }

//     // Parameterized constructor with two parameters
//     Student(int i, String n) {
//         id = i;
//         name = n;
//     }

//     void display() {
//         System.out.println("ID: " + id + ", Name: " + name);
//     }
// }

// public class exp_7{
//     public static void main(String[] args) {
//         Student s1 = new Student();                 // calls default constructor
//         Student s2 = new Student(101);              // calls one-parameter constructor
//         Student s3 = new Student(102, "Karan");     // calls two-parameter constructor

//         s1.display();
//         s2.display();
//         s3.display();
//     }
// }
