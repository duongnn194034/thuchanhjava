package baithuchanh3;
import java.util.Date;
public class Company {
    private String name;
    private Date dateCreate;
    private Employee[] employees = new Employee[10];

    public String getName() {
        return name;
    }
    public void showListEmployee () {
        for(Employee e : employees) {
            e.display();
        }
    }
    public void addNewEmployee (Employee e) {
        if(employees.length == 10) {
            info();
        }
        else employees[employees.length] = e;
    }
    public void info () {
        System.out.println("Cong ty da tuyen toi da so nguoi!");
    }
}
