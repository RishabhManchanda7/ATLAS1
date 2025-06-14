class Employee {
    private int pwd;
    protected int Salary;
    public int empid;


    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public int getPwd() {
        return pwd;
    }
}

class Hr extends Employee {
    void details() {
        super.Salary = 50000;
        super.empid = 10001;

        System.out.println("Emp ID: " + empid);
        System.out.println("Salary: " + Salary);
    }
}

public class task37 {
    public static void main(String[] args) {
        Hr obj = new Hr();

        obj.empid = 20002;

        System.out.println("Main: " + obj.empid);
        obj.details();
    }
}