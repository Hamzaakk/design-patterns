package CreationDP.Builder;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee.Builder().emp_id(2).emp_name("hamza").emp_email("aakkaouihamza@gmail.com").build();
        System.out.println(employee.toString());
    }
}
