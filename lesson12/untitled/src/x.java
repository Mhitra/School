import java.util.Collections;
import java.util.List;
class x {
public void displayAllPeople(List<Person> people) {
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public void displayEmployees(List<Employee> employees) {
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public void findEmployeeByNationalInsuranceNumber(List<Employee> employees, String nationalInsuranceNumber) {
        for (Employee employee : employees) {
            if (employee.getNationalInsuranceNumber().equals(nationalInsuranceNumber)) {
                System.out.println(employee.getName());
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void increaseSalaryForLongTermEmployees(List<Employee> employees, int currentYear) {
        for (Employee employee : employees) {
            if (currentYear - employee.getYearStartedWork() > 5) {
                employee.setAnnualSalary(employee.getAnnualSalary() * 1.1);
            }
        }
    }
}