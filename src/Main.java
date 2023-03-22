import java.util.Scanner;

public class Main {
    public static String savedPassword;

    public static void main(String[] args) {
        System.out.println("Введите логин");
        Scanner sc = new Scanner(System.in);
        do {
            String login = sc.nextLine();
            if (login.length() <= 20 && login.matches("^[a-zA-Z_0-9]+$")) {
                System.out.println("Введите пароль");
                break;
            } else {
                System.out.println("Некорректный ввод");
            }
        } while (true);
        do {
            String password = sc.nextLine();
            if (password.length() <= 20 && password.matches("^[a-zA-Z_0-9]+$")) {
                System.out.println("Подтвердите пароль");
                 savedPassword = password;
                break;
            } else {
                System.out.println("Некорректный ввод");
            }
        } while (true);
        do {
            String confirmPassword = sc.nextLine();
            if (confirmPassword.length() <= 20 && confirmPassword.matches("^[a-zA-Z_0-9]+$")) {

                if (confirmPassword.equals(savedPassword)) {
                    System.out.println("Пароль принят");
                    break;
                }else {
                    System.out.println("Пароли не совпадают");

                }
            } else {
                System.out.println("Некорректный ввод");
            }
        } while (true);
    }
}