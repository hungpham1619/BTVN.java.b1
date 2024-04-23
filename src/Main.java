import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        int choose;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n----------------------");
            System.out.println("1. Display Employees");
            System.out.println("2. Add a Employee");
            System.out.println("3. Remove a Employees");
            System.out.println("----------------------");
            System.out.print("\nChoose function: ");
            choose = sc.nextInt();

            switch (choose){
                case 1: employeeController.DisplayEmployee(); break;
                case 2:
                    try{
                        System.out.println("Info for a new employee");
                        System.out.print("\nID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Department: ");
                        String department = sc.nextLine();
                        System.out.print("Code: ");
                        int code = sc.nextInt();
                        System.out.print("Rate salary: ");
                        double salary_rate = sc.nextDouble();

                        employeeController.CreateEmployee(id, name, age, department, code, salary_rate);
                        break;
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                case 3:
                    try {
                        System.out.print("Enter a id employee want remove: ");
                        int id = sc.nextInt();
                        employeeController.DeleteEmployee(id);
                        break;
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                default: return;
            }
        }
        while (true);
    }
}