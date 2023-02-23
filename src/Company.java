import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company {

    List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employees.add(employee);
    }
    public void hireAll (Collection<Employee> employes) {
        employees.addAll(employes);
    }
    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public static int getIncome () {
        return 5_000_000 + (int) (Math.random() * 10_000_001);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employees);
        List<Employee> limitList = new ArrayList<>();
        for (int i = employees.size() - 1; i >= employees.size() - count; i--) {
            limitList.add(employees.get(i));
        }
        return limitList;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employees);
        List<Employee> limitList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            limitList.add(employees.get(i));
        }
        return limitList;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
