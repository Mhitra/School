import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class EmployeeHashtable {
    private Hashtable<Integer, Employee> employees;

    public EmployeeHashtable() {
        employees = new Hashtable<Integer, Employee>();
    }

    public void addEmployee(int id, String name, String surname) {
        Employee newEmployee = new Employee(id, name, surname);
        employees.put(id, newEmployee);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void changeSurname(int id, String newSurname) {
        Employee employee = employees.get(id);
        employee.setSurname(newSurname);
    }

    public void removeEmployee(int id) {
        employees.remove(id);
    }

    public String getAllIds() {
        return employees.keySet().toString();

    }

    public String toString() {
        return employees.values().toString();
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new Vector<Employee>(employees.values());
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId() - o2.getId();
            }
        });
        return employeeList;
    }

}