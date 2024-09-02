package CreationDP.Builder;

public class Employee {
    private int emp_id;
    private int emp_salary;
    private String emp_name;
    private  String emp_address;
    private  String emp_department;
    private  String emp_email;


    private Employee(int emp_id, int emp_salary, String emp_name, String emp_address,String emp_department, String emp_email) {
        this.emp_id = emp_id;
        this.emp_salary = emp_salary;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_department = emp_department;
        this.emp_email = emp_email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_salary=" + emp_salary +
                ", emp_name='" + emp_name + '\'' +
                ", emp_address='" + emp_address + '\'' +
                ", emp_department='" + emp_department + '\'' +
                ", emp_email='" + emp_email + '\'' +
                '}';
    }


    public static class Builder {
        private int emp_id;
        private int emp_salary;
        private String emp_name;
        private  String emp_address;
        private  String emp_department;
        private  String emp_email;

        public Builder emp_id(int emp_id) {
            this.emp_id = emp_id;
            return this;
        }

        public Builder emp_salary(int emp_salary) {
            this.emp_salary = emp_salary;
            return this;
        }
        public Builder emp_name(String emp_name) {
            this.emp_name = emp_name;
            return this;
        }

        public Builder emp_address(String emp_address) {
            this.emp_address = emp_address;
            return this;
        }


        public Builder emp_department(String emp_department) {
            this.emp_department = emp_department;
            return this;
        }


        public Builder emp_email(String emp_email) {
            this.emp_email = emp_email;
            return this;
        }

        public Employee build() {
            return new Employee( this.emp_id,  this.emp_salary,  this.emp_name,  this.emp_address, this.emp_department,  this.emp_email);
        }

    }


}
