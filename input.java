package rami;
import java.util.Scanner;

public class input {
    Scanner sc = new Scanner(System.in);

    public String getInput() {
        String input = sc.nextLine().toLowerCase();
        return input; // ✅ Fix: return the input
    }
}
