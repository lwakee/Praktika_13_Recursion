package Pack;

public class Rec10 {
    public static void sol(int n){
        if (n==0){
            return;
        } else {
            System.out.print(n%10);
            sol(n/10);
        }
    }
}
