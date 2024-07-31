package Java1.nisumEmployeePackage;
import Java1.Npratice31July.*;
import Java1.Npratice31July.Employee;
import Java1.Npratice31July.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NisumEmployee {
    private int id;
    private String name;
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NisumEmployee that = (NisumEmployee) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "NisumEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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


    //  public static void main(String[] args) {
      /*  EmployeeService obj= new EmployeeService();
        obj.toString();

        obj.msg();
        List<Employee> employee1=employee.ArrayList<>();
        employee1.addAll(employee);



        List<Employee> list1 = Employee.ArrayList();
        List<EmployeeService> list2 = EmployeeService.getList2();

        // Add list2 to list1
        list1.addAll(list2);

        System.out.println(list1);

    }
*/

}
