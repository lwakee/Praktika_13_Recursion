package Pack;
import java.util.Scanner;
public class Rec12 {
    public static void sol() {
        Scanner scanner = new Scanner(System.in);
        solrec(scanner);
    }
    private static void solrec(Scanner scanner) {
        int current = scanner.nextInt();

        if (current == 0) {
            return;
        }

        if (current % 2 != 0) {
            System.out.println(current);
        }

        solrec(scanner);
    }
}

