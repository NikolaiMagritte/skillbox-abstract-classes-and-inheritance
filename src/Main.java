public class Main {
    public static void main(String[] args) {
        Company company1 = new Company();

        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator();
            company1.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager();
            company1.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager();
            company1.hire(topManager);
        }

        System.out.println("15 сотрудников с самыми высокими з.п.:");
        for (Employee topSalary : company1.getTopSalaryStaff(15)) {
            System.out.println(topSalary);
        }
        System.out.println("30 сотрудников с самыми низкими з.п.:");
        for (Employee lowSalary : company1.getLowestSalaryStaff(30)) {
            System.out.println(lowSalary);
        }

        int employeesCount = company1.getEmployees().size();
        for (int i = 0; i < employeesCount / 2; i++) {
            int radomIndex = (int) (Math.random() * company1.getEmployees().size());
            company1.fire(company1.getEmployees().get(radomIndex));
        }

        System.out.println("\n15 сотрудников с самыми высокими з.п.:");
        for (Employee topSalary : company1.getTopSalaryStaff(15)) {
            System.out.println(topSalary);
        }
        System.out.println("30 сотрудников с самыми низкими з.п.:");
        for (Employee lowSalary : company1.getLowestSalaryStaff(30)) {
            System.out.println(lowSalary);
        }

    }
}
