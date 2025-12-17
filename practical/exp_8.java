// // 8a)

// class Employee {
//     private int id;
//     private String name;
//     private double salary;

//     // Setters
//     public void setId(int i) { id = i; }
//     public void setName(String n) { name = n; }
//     public void setSalary(double s) { salary = s; }

//     // Getters
//     public int getId() { return id; }
//     public String getName() { return name; }
//     public String getSalary() { return "₹" + String.format("%.2f", salary); }
// }

// public class exp_8{
//     public static void main(String[] args) {
//         Employee e = new Employee();
//         e.setId(101); e.setName("Karan"); e.setSalary(55000);

//         System.out.println("ID: " + e.getId());
//         System.out.println("Name: " + e.getName());
//         System.out.println("Salary: " + e.getSalary());
//     }
// }

// 8b)

// class Rectangle {
//     private double length;
//     private double width;

//     // Setter for length
//     public void setLength(double l) {
//         length = l;
//     }

//     // Getter for length
//     public double getLength() {
//         return length;
//     }

//     // Setter for width
//     public void setWidth(double w) {
//         width = w;
//     }

//     // Getter for width
//     public double getWidth() {
//         return width;
//     }
// }

// public class exp_8{
//     public static void main(String[] args) {
//         Rectangle r = new Rectangle();

//         r.setLength(10.5);
//         r.setWidth(5.25);

//         System.out.println("Length: " + r.getLength());
//         System.out.println("Width: " + r.getWidth());
//     }
// }


// 8c)

// class BankAccount {
//     private String accNo;
//     private double balance;

//     public void setAccNo(String a) { accNo = a; }
//     public String getAccNo() { return accNo; }

//     public void setBalance(double b) { balance = b; }
//     public double getBalance() { return balance; }
// }

// public class exp_8{
//     public static void main(String[] args) {
//         BankAccount acc = new BankAccount();
//         acc.setAccNo("AC12345");
//         acc.setBalance(50000);

//         System.out.println("Account: " + acc.getAccNo());
//         System.out.println("Balance: ₹" + acc.getBalance());
//     }
// }
