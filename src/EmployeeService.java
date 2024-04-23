import java.util.ArrayList;

public class EmployeeService {
    private final ArrayList<Employee> employees = new ArrayList<>();
    public EmployeeService(){
        employees.add(new Employee(1, "Tuan", 21, "Something", 221, 2.1));
        employees.add(new Employee(2, "Tu", 20, "Something", 222, 2.5));
        employees.add(new Employee(3, "Thinh", 21, "Something", 223, 2.1));
        employees.add(new Employee(4, "Thom", 21, "Something", 224, 2.1));
        employees.add(new Employee(5, "Dung", 21, "Something", 225, 2.1));
        employees.add(new Employee(6, "Truong", 21, "Something", 226, 2.1));
        employees.add(new Employee(7, "Hung", 21, "Something", 227, 2.1));
        employees.add(new Employee(8, "Ngoc", 21, "Something", 228, 2.1));
        employees.add(new Employee(9, "Linh", 21, "Something", 229, 2.1));
        employees.add(new Employee(10, "Hoang", 21, "Something", 220, 2.1));
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public boolean CreateEmployee(Employee e) {
        for(Employee emp : employees){
            if(emp.getId() == e.getId()){
                return false;
            }
        }
        employees.add(e);
        return true;
    }

    public boolean DeleteEmployee(int id) {
        return employees.removeIf(e -> e.getId() == id);
    }
}
