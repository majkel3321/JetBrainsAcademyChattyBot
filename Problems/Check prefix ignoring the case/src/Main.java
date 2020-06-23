import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().substring(0,1);
        System.out.println(input.equalsIgnoreCase("j"));
    }
}