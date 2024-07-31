package Java1.Npratice31July;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
    private int empId;
    private String Name;
    private int age;
    private String company;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && age == employee.age && Objects.equals(Name, employee.Name) && Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, Name, age, company);
    }
/* public Employee(String company) {
        this.company = company;
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

   /* public Employee(int empId, String name, int age) {
        this.empId = empId;
        Name = name;
        this.age = age;
    }*/

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
