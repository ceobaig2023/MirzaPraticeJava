package Java1.Npratice31July;

import Java1.nisumEmployeePackage.NisumEmployee;

import java.util.AbstractList;
import java.util.*;

public class EmployeeService {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("person1");
        emp1.setCompany("nisum");
        emp1.setAge(12);
        emp1.setEmpId(1);
        emps.add(emp1);

        Employee emp2 = new Employee();
        emp2.setName("person2");
        emp2.setCompany("nisum");
        emp2.setAge(12);
        emp2.setEmpId(2);
        emps.add(emp2);
        Employee emp3 = new Employee();
        emp3.setName("person3");
        emp3.setCompany("nisum");
        emp3.setAge(12);
        emp1.setEmpId(3);
        emps.add(emp3);
        Employee emp4 = new Employee();
        emp4.setName("person4");
        emp4.setCompany("nisum");
        emp4.setAge(12);
        emp4.setEmpId(4);
        emps.add(emp4);

        Employee emp5 = new Employee();
        emp5.setName("person5");
        emp5.setCompany("nisum");
        emp5.setAge(12);
        emp5.setEmpId(5);
        emps.add(emp5);
        List<NisumEmployee> nisumEmployees = new ArrayList<>();
        for (Employee emp : emps) {
            NisumEmployee nisumEmployee = new NisumEmployee();
            nisumEmployee.setId(emp.getEmpId());
            nisumEmployee.setCompany(emp.getCompany());
            nisumEmployees.add(nisumEmployee);
        }
        System.out.println(emps);
    }

}