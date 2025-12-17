//   class Employee {
//   String empName, empId, address, mailId;
//     long mobileNo;
//     double bp; // basic pay

//     void display() {
//         System.out.println("\nEmployee ID: " + empId);
//         System.out.println("Name: " + empName);
//         System.out.println("Mail ID: " + mailId);
//         System.out.println("Address: " + address);
//         System.out.println("Mobile No: " + mobileNo);
//     }

//     void calcSalary() {
//         double da = 0.97 * bp;
//         double hra = 0.10 * bp;
//         double pf = 0.12 * bp;
//         double scf = 0.001 * bp;

//         double gross = bp + da + hra;
//         double net = gross - pf - scf;

//         System.out.println("Basic Pay: " + bp);
//         System.out.println("Gross Salary: " + gross);
//         System.out.println("Net Salary: " + net);
//     }
// }

// // Derived classes
// class Programmer extends Employee {}
// class AssistantProfessor extends Employee {}
// class AssociateProfessor extends Employee {}
// class Professor extends Employee {}

// public class exp_10{
//     public static void main(String[] args) {
//         Programmer p = new Programmer();
//         p.empName = "Karan";
//         p.empId = "E101";
//         p.address = "Jodhpur";
//         p.mailId = "karan@gmail.com";
//         p.mobileNo = 9876543210L;
//         p.bp = 50000;

//         p.display();
//         p.calcSalary();
//     }
// }


// class Vehicle {
//     void drive() {
//         System.out.println("Driving a vehicle");
//     }
// }

// class Car extends Vehicle {
//     @Override
//     void drive() {
//         System.out.println("Repairing a car");
//     }
// }

// public class exp_10{
//     public static void main(String[] args) {
//         Car c = new Car();
//         c.drive();
//     }
// }


// class Employee {
//     void work() {
//         System.out.println("Employee is working");
//     }

//     void getSalary() {
//         System.out.println("Employee salary is 50,000");
//     }
// }

// class HRManager extends Employee {
//     @Override
//     void work() {
//         System.out.println("HR Manager is managing employees");
//     }

//     void addEmployee() {
//         System.out.println("New employee added");
//     }
// }

// public class exp_10{
//     public static void main(String[] args) {
//         HRManager hr = new HRManager();
//         hr.work();         // overridden method
//         hr.getSalary();    // inherited method
//         hr.addEmployee();  // new method in subclass
//     }
// }
