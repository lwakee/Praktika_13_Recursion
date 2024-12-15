package Pack;
import java.util.Scanner;

public class Rec11 {
    public static int sol() {
        Scanner scanner = new Scanner(System.in);
        return solrec(scanner, 0);
    }
    private static int solrec(Scanner scanner, int previous) {
        int current = scanner.nextInt();

        if (previous == 0 && current == 0) {
            return 0;
        }
        int k = 0;
        if (current == 1) {
            k = 1;
        }
        return k + solrec(scanner, current);
    }
}

