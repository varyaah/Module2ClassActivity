public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void giveRaise(double percentage) {
        salary += salary * (percentage / 100);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Varya Hinkel", "Software Engineer", 500000.0);
        
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());

        employee.giveRaise(10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());
    }
}