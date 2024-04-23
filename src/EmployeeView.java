public class EmployeeView {
    public void DisplayEmployeeDetails(Employee employee) {
        System.out.println("\nID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Code: " + employee.getCode());
        System.out.println("Rate Salary: " + employee.getSalary_rate());
    }

    public void DisplayStateCreateEmployee(boolean state) {
        if(state){
            System.out.println("\nThêm mới nhân viên thành công!");
        }
        else {
            System.out.println("\nThêm nhân viên thất bại!");
        }
    }

    public void DisplayStateDeleteEmployee(boolean state) {
        if(state){
            System.out.println("\nXoá nhân viên thành công!");
        }
        else {
            System.out.println("\nXoá nhân viên thất bại!");
        }
    }
}
