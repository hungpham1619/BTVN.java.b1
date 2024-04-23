import java.util.ArrayList;

public class EmployeeController {
    private EmployeeService employeeService;
    private EmployeeView employeeView;
    private ArrayList<Employee> employees = new ArrayList<>();
    public EmployeeController() {
        employeeService = new EmployeeService();
        employeeView = new EmployeeView();
        employees = employeeService.getEmployees();
    }

    public void DisplayEmployee() {
        for (Employee employee : employees) {
            employeeView.DisplayEmployeeDetails(employee);
        }
    }

    public void CreateEmployee(int id, String name, int age, String department, int code, double salary_rate){
        Employee e = new Employee(id, name, age, department, code, salary_rate);
        boolean _isAdded = employeeService.CreateEmployee(e);
        employeeView.DisplayStateCreateEmployee(_isAdded);
    }

    public void DeleteEmployee(int id){
        boolean _idDeleted = employeeService.DeleteEmployee(id);
        employeeView.DisplayStateDeleteEmployee(_idDeleted);
    }
}
