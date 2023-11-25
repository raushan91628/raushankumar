import java.util.*;
public class Two_D_Array {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int[][] number = new int[rows][columns];
            for( int i=0;i<rows; i++)
            {
                //input
                for(int j=0;j<columns;j++)
                {
                    number[i][j] = sc.nextInt();
                }
            }
            //output
              for( int i=0;i<rows; i++)
            {
                for(int j=0;j<columns;j++)
                {
                    System.out.print(number[i][j] +" ");
                }
                System.out.println();
            }




        }
    }
    
    
}

// //Question of the 2d searching element
// int rows = sc.nextInt();
//             int columns = sc.nextInt();
//             int[][] number = new int[rows][columns];
//             for( int i=0;i<rows; i++)
//             {
//                 //input
//                 for(int j=0;j<columns;j++)
//                 {
//                     number[i][j] = sc.nextInt();
//                 }
//             }
//             int x = sc.nextInt();
//             //output
//               for( int i=0;i<rows; i++)
//             {
//                 for(int j=0;j<columns;j++)
//                 {
//                    // System.out.print(number[i][j] +" ");
//                    if(number[i][j]==x)
//                    {
//                     System.out.print("x found at location("+i+","+j+")");
//                    }
//                 }
//                // System.out.println();
//             }

