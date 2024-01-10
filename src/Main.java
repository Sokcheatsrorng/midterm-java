import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDateStr = scanner.nextLine();

        // Parse the short date string to LocalDate
        LocalDate shortDate = LocalDate.parse(shortDateStr);

        // Extract year, month, and day from the short date
        int year = shortDate.getYear();
        Month month = shortDate.getMonth();
        int day = shortDate.getDayOfMonth();

        String fullDate = String.format("%s %02d, %d", month, day, year);
        System.out.println("Full Date Representation: " + fullDate);
    }
}