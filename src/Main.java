import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("some text 133", "Справка");
        printer.append("some text 210", 544);
        System.out.println(printer.getPendingPagesCount());
        printer.print();
        printer.append("some text 8", 530);
        printer.clear();
        printer.append("some text 23", "Договор", 312);
        printer.append("some text 0");
        printer.print();
        System.out.println(printer.getAllPrinteredPagesCount());
    }

/*    public static void getInformation(User user) {
        int countGetUserAge = user.getUserAge() % 10;
        switch (countGetUserAge) {
            case 1 -> System.out.println("Пользователь: " +
                    user.getUserName() +
                    ", " +
                    user.getUserAge() +
                    " год");
            case 2,3,4 -> System.out.println("Пользователь: " +
                    user.getUserName() +
                    ", " +
                    user.getUserAge() +
                    " года");
            default -> System.out.println("Пользователь: " +
                    user.getUserName() +
                    ", " +
                    user.getUserAge() +
                    " лет");
        }
    }*/
}