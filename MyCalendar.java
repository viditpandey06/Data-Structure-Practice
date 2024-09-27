import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {

    public static void printCalendar(int month, int year) {
        // Create a Calendar object and set it to the first day of the given month and year
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        // Get the day of the week for the first day of the month
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Get the number of days in the month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the calendar header
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Print the calendar for the given month and year
        printCalendar(month, year);
    }
}