package classworks.lesson4_20230320.enumEx;

import java.util.List;
import java.util.Set;

public class E1 {
}

enum SecurityLevel {
  LOW,
  MEDIUM,
  HIGH
}

class Company {
  private String name;
  private List<Department> departmentList;
}

enum Department {
  IT,
  HR,
  FINANCE,
  SALES;
  private List<Information> information;
}

class Information {
  String info;
}

class Employee {
  private String name;
  private Department department;
  private SecurityLevel securityLevel;

  public Employee(String name, Department department, SecurityLevel securityLevel) {
    this.name = name;
    this.department = department;
    this.securityLevel = securityLevel;
  }

  public SecurityLevel getSecurityLevel() {
    return securityLevel;
  }

  public void setSecurityLevel(SecurityLevel securityLevel) {
    this.securityLevel = securityLevel;
  }
}

class Main{
  public static void main(String[] args) {
    Employee employee = new Employee("Ivan", Department.HR, SecurityLevel.LOW);
    if (employee.getSecurityLevel() == SecurityLevel.LOW) {
      System.out.println("low");
    }
  }
}