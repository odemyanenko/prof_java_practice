package classworks.lesson27_20230626.treeOfModels;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Удобно обрабатывать и представлять любую иерархию
 * Tree of Models
 */
public class Department {
  private String name;
  private List<Employee> employees;
  private List<Department> subDepartment;
  private Department superDepartment;

  public Department(String name) {
    this.name = name;
    employees = new ArrayList<>();
    subDepartment = new ArrayList<>();

  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public void addSubDep(Department department) {
    subDepartment.add(department);
  }

  public void printHierarchy(String prefix) {
    System.out.println(prefix + name);

    for (Department department : subDepartment) {
      department.printHierarchy(prefix + " ");
    }

    for (Employee employee : employees) {
      System.out.println(prefix + " " + employee.getName() + " " + employee.getPosition());
    }
  }
}

@Getter
@AllArgsConstructor
class Employee {
  private String name;
  private String position;
}

class Main {
  public static void main(String[] args) {
    Department develop = new Department("Development");
    Department front = new Department("Front End");
    Department back = new Department("Back End");
    Department marketing = new Department("Marketing");

    Employee john = new Employee("John", "Java Developer");
    Employee jane = new Employee("Jane", "Marketing specialist");

    develop.addEmployee(john);
    marketing.addEmployee(jane);

    develop.addSubDep(front);
    develop.addSubDep(back);

    develop.printHierarchy(" ");
    marketing.printHierarchy(" ");
  }
}