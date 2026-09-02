import java.util.Scanner;

public class Sep02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        boolean valid = true;

        if (year <= 0 || month < 1 || month > 12 || day < 1) {
            valid = false;
        } else {
            int daysInMonth;

            switch (month) {
                case 2:
                    daysInMonth = ((year % 400 == 0) ||
                            (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;

                default:
                    daysInMonth = 31;
            }

            if (day > daysInMonth) {
                valid = false;
            }
        }

        System.out.println(valid ? "Valid Date" : "Invalid Date");

        scanner.close();
    }
}