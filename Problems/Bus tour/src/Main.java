import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int bridges_nr = scanner.nextInt();
        int value = 0;
        boolean will_crash = false;
        int small_bridge = 0;

        for (int i = 1; i <= bridges_nr; i++){
            value = scanner.nextInt();

            if (value <= height && !will_crash) {
                will_crash = true;
                small_bridge = i;
            }
        }

        if (will_crash) {
            System.out.println("Will crash on bridge " + small_bridge);
        } else {
            System.out.println("Will not crash");
        }
    }
}