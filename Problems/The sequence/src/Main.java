import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int i = 0;
        int max = 0;
        int temp = 0;

        while (i < count) {
            i++;
            temp = scanner.nextInt();
            if (temp % 4 == 0 && temp > max) {
                max = temp;
            }
        }

        System.out.println(max);
    }
}