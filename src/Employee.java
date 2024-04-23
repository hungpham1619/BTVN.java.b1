public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private int code;
    private double salary_rate;
    public Employee() {}
    public Employee(int id, String name, int age, String department, int code, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salary_rate = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSalary_rate() {
        return salary_rate;
    }

    public void setSalary_rate(double salary_rate) {
        this.salary_rate = salary_rate;
    }
}
