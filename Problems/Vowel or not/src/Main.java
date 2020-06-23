import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char ch1 = Character.toLowerCase(ch);
        if (ch1 == 'a' || ch1 == 'e' || ch1 == 'u' 
                || ch1 == 'o' || ch1 == 'i') {
            return true;
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
