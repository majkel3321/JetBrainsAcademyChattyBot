import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int value = 0;

        while (true) {
            value = scanner.nextInt();

            if (value == 0) {
                break;
            }

            if (sum < 1000) {
                sum += value;
            }
        }

        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }
    }
}
