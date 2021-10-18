import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год:");
        int year = scanner.nextInt();
        int remainder = year % 4;

        if (remainder == 0) {
            System.out.printf("%nГод является високосным%n");
        } else {
            System.out.printf("%nГод не является високосным%n");
        }
    }
}
