package src;

public class Abstract {

    public static void main(String[] args) {
        /* Cannot create object of abstract class directly */
        employee e = new SalaryEmployee("George W.", "Houston, TX", 43, 4500.00);
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
    }
}

// Abstract class
abstract class employee {
    private String name;
    private String address;
    private int number;

    public employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + ", " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }

    // Abstract method (optional)
    public abstract double computePay();
}

// Concrete subclass
class SalaryEmployee extends employee {
    private double salary;

    public SalaryEmployee(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    @Override
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 12; // Monthly salary
    }

    @Override
    public void mailCheck() {
        System.out.println("Within mailCheck of SalaryEmployee class");
        System.out.println("Mailing check to " + getName() + " with salary: $" + salary);
    }
}