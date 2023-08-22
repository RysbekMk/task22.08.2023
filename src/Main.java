import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(new Employee(1, "Rysbek", 24, 10000));
        employees.add(new Employee(2, "Ruslan", 27, 894000));
        employees.add(new Employee(3, "Nurjigit", 22, 340000));
        employees.add(new Employee(4, "Aizirek", 19, 145000));
        employees.add(new Employee(4, "Nurtegin", 15, 235445));
        employees.add(new Employee(5, "Aleriza", 19, 546533));
        employees.add(new Employee(6, "Bekbolsun", 25, 3445435));
        employees.add(new Employee(7, "Maral", 18, 435543));
        employees.add(new Employee(8, "Aidai", 18, 432545));
        employees.add(new Employee(9, "Tumurlan", 27, 6434466));
        employees.add(new Employee(10, "Marsel", 26, 756357));

        Admin admin = new Admin();
        admin.delleteEmployees(employees);
    }
}