import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        int desk1 = (class1 / 2) + (class1 % 2);
        int desk2 = (class2 / 2) + (class2 % 2);
        int desk3 = (class3 / 2) + (class3 % 2);

        System.out.println(desk1 + desk2 + desk3);
    }
}