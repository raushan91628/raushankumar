import java.util.*;

public class fabonicess {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of term:");
            int n = sc.nextInt();
            // int nextterm = sc.nextInt();
            // int i = sc.nextInt();
            int t1 = 0;
            int t2 = 1;
            System.out.println(t1);
            System.out.println(t2);
            for (int i = 3; i <= n; i++) {
                int nextterm = t1 + t2;
                t1 = t2;
                t2 = nextterm;

                System.out.println(nextterm);
            }
        }

    }

}
