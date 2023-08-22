import java.util.Scanner;
import java.util.Set;

public class Admin {
    private final String LOGIN = "login";
    private final String PASSWORD = "password";

    public Admin() {
    }

    public void scanMethod() {
        Scanner scanner = new Scanner(System.in);
        int popytka = 5;
        while (popytka > 0) {
            System.out.println("Enter login: ");
            String login = scanner.nextLine().toLowerCase();
            if (!login.equals(LOGIN)) {
                System.out.println("\u001B[031m" + "Login is false!" + " attempts left " + "\u001B[0m" + '[' + popytka + ']');
                popytka--;
            } else {
                int popytka2 = 5;
                while (popytka2 > 0) {
                    System.out.println("Your password: ");
                    String password = scanner.nextLine().toLowerCase();
                    if (!password.equals(PASSWORD)) {
                        System.out.println("\u001B[031m" + "Password is false!" + " attempts left " + "\u001B[0m" + '[' + popytka2 + ']');
                        popytka2--;
                    } else {
                        System.out.println("\u001B[033m" + "WELCOME" + "\u001B[0m");
                        break;
                    }
                }
                break;
            }
        }
    }

    public void getEmployees(Set<Employee> employees) {
        scanMethod();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void delleteEmployees(Set<Employee> employees) {
        scanMethod();
        employees.clear();
        System.out.println("Employees delete successfuly!");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "LOGIN='" + LOGIN + '\'' + ", PASSWORD='" + PASSWORD + '\'' +
                '}';
    }

}
