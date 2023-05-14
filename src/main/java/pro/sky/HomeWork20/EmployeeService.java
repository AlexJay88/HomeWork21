package pro.sky.HomeWork20;

import java.util.Map;

public interface EmployeeService {
    pro.sky.HomeWork20.Employee addEmployee(String firstName, String lastName, Integer salary, Integer department);
    void removeEmployee(String firstName, String lastName);
    pro.sky.HomeWork20.Employee findEmployee(String firstName, String lastName);
    Map<String, pro.sky.HomeWork20.Employee> getAllEmployees();
}

