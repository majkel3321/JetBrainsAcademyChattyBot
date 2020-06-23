import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = scanner.nextInt();
        int toBig = 0;
        int toSmall = 0;
        int perfect = 0;
        int piece = 0;

        for (int i = 0; i < inputs; i++) {
            piece = scanner.nextInt();
            if (piece == 1) {
                toBig++;
            } else if (piece == 0) {
                perfect++;
            } else if (piece == -1) {
                toSmall++;
            }
        }

        System.out.println(perfect + " " + toBig + " " + toSmall);
    }
}