class Employee {
    private int id;
    private String name;
    private double salary;

    // Setters
    public void setId(int i) { id = i; }
    public void setName(String n) { name = n; }
    public void setSalary(double s) { salary = s; }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSalary() { return "₹" + String.format("%.2f", salary); }
}

public class exp_8 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101); e.setName("Karan"); e.setSalary(55000);

        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}
