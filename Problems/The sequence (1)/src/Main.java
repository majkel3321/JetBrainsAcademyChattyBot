import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int t1 = 1;
        int t2 = 0;

        while (t2 < count) {

            for (int i = 0; i < t1; i++) {
                System.out.print(t1 + " ");
                t2++;
            }
            t1++;
        }
    }
}