public class Operator implements Employee {
    private static final int SALARY = 60_000;
    private int earned;

    public Operator() {
        earned = 20_000 + (int) (Math.random() * 20_001);
    }

    @Override
    public double getMonthSalary() {
        return SALARY + 0.01 * earned;
    }

    @Override
    public int compareTo(Object o) {
        Employee operator = (Employee) o;
        return Double.compare(getMonthSalary(), ((Employee) o).getMonthSalary());
    }

    @Override
    public String toString() {
        return "Оператор - " + getMonthSalary();
    }
}
