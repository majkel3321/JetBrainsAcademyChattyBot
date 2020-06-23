import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int square = 1;

        while (square * square <= value) {
            System.out.println(square * square);
            square++;
        }
    }
}