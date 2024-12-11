import java.util.Scanner;

public class IT24104027Lab5Q3 {
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DAYS_FOR_10_PERCENT_DISCOUNT = 3;
    public static final int DAYS_FOR_20_PERCENT_DISCOUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (day): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (day): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Invalid input. Start and end dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Invalid input. Start date must be less than end date.");
            return;
        }

        int daysReserved = endDate - startDate + 1;
        double discountRate = 0;

        if (daysReserved >= DAYS_FOR_20_PERCENT_DISCOUNT) {
            discountRate = 0.2;
        } else if (daysReserved >= DAYS_FOR_10_PERCENT_DISCOUNT) {
            discountRate = 0.1;
        }

        double totalAmount = ROOM_CHARGE_PER_DAY * daysReserved * (1 - discountRate);

        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs " + totalAmount);

        scanner.close();
    }
}