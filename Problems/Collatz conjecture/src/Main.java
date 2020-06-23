import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        while (value != 1) {
            System.out.print(value + " ");

            if (value % 2 == 0) {
                value /= 2;
            } else {
                value *= 3;
                value++;
            }
        }
        System.out.println(value);
    }
}