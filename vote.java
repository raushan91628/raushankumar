import java.util.*;

public class vote {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of voter");
      int votercount = sc.nextInt();

      int ballot[] = new int[6];
      //int ballot{0} = new int{0};

      while (votercount > 0)
      {
        System.out.print("cast of voter:");
        int voter = sc.nextInt();
        switch (voter) {
          case 1:
            ballot[voter]++;
            break;
          //   case 2:
          //   ballot[voter]++;
          //   break;
            
          //   case 3:
          //   ballot[voter]++;
          //   break;
          //   case 4:
          //   ballot[voter]++;
          //   break;
          //   case 5:
          //   ballot[voter]++;
          //   break;
          // default:
        
           case 0 : ballot[0]--;
            break;
        }

        votercount--;
      }
      int n = 5;
      for (int i = 1; i <= n; i++) {
        System.out.println(" cast of voter:-"  +ballot[i] );
      }
    }
  }

}