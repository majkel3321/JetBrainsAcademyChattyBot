import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isPartySuccessful = (isWeekend && value >= 15 && value <= 25) || (!isWeekend && value >= 10 && value <= 20);
        System.out.println(isPartySuccessful);
    }
}