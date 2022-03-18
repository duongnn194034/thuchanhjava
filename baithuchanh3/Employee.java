package baithuchanh3;
import java.util.*;
public class Employee extends Person {
    private Date dateJoin;
    private String position;
    private double salaryLevel;
    private double basicSalary;

    public Employee () {
        super();
    }
    public int getId () {
        return super.getId();
    }
    public double getIncome () {
        return salaryLevel * basicSalary;
    }
    public void setSalaryLevel (double level) {
        this.salaryLevel = level;
    }
    public void setBasicSalary (double salary) {
        this.basicSalary = salary;
    }
    public void display () {
        super.display();
        System.out.println("Ngay bat dau lam viec: " + dateJoin);
        System.out.println("Vi tri: " + position);
        System.out.println("Thu nhap: " + this.getIncome());
    }
    
    
}
