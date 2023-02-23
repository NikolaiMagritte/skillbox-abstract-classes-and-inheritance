public class TopManager implements Employee {

    private static final int SALARY = 100_000;
    private int earned;

    public TopManager() {
        earned = 115_000 + (int) (Math.random() * 25_001);
    }

    @Override
    public double getMonthSalary() {
        return SALARY + (Company.getIncome() > 10_000_000 ? 1.5 * earned : 0);
    }

    @Override
    public int compareTo(Object o) {
        Employee topManager = (Employee) o;
        return Double.compare(getMonthSalary(), ((Employee) o).getMonthSalary());
    }
    @Override
    public String toString() {
        return "Топ Менеджер - " + getMonthSalary();
    }
}
