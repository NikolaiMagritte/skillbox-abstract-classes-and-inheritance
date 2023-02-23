public class Manager implements Employee {
    private static final int SALARY = 80_000;
    private int earned;

    public Manager() {
        earned = 115_000 + (int) (Math.random() * 25_001);
    }

    @Override
    public double getMonthSalary() {
        return SALARY + earned * 0.05;
    }

    @Override
    public int compareTo(Object o) {
        Employee manager = (Employee) o;
        return Double.compare(getMonthSalary(), ((Employee) o).getMonthSalary());
    }

    @Override
    public String toString() {
        return "Менеджер - " + getMonthSalary();
    }
}
