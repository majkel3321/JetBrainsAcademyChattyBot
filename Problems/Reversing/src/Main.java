import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int reversedNumber = number % 10;
        reversedNumber *= 10;
        number /= 10;
        reversedNumber += (number % 10);
        reversedNumber *= 10;
        number /= 10;
        reversedNumber += number;

        System.out.println(reversedNumber);

    }
}