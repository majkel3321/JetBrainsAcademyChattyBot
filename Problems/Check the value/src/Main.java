import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean check = value > 0 && value < 10;
        System.out.println(check);
    }
}
