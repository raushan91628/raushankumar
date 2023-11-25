import java.util.*;
public class pattern {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n=5;
            for( int i=1; i<=n;i++)
            {
                for( int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                int space = 2*(n-i);
                for( int j=1;j<=space ;j++)
                {
                   System.out.print(" "); 
                }
                for( int j=1;j<=i ;j++)
                {
                     System.out.print("*");
                }
                 System.out.println();
            }
             for( int i=n; i>=1;i--)
            {
                for( int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                int space = 2*(n-i);
                for( int j=1;j<=space ;j++)
                {
                   System.out.print(" "); 
                }
                for( int j=1;j<=i ;j++)
                {
                     System.out.print("*");
                }
                 System.out.println();
            }

//             //output
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *





       // int n=5;
        for( int i=1; i<=n;i++)
        {
            for( int j=1;j<=n-i;j++)
            {
                System.out.print(" "); 
            }
            for(int j=1;j<=n;j++)
            {
                 System.out.print("*");
            }
             System.out.println();
        }
// //output
//     *****
//    *****
//   *****
//  *****
// *****





       //     int n=5;
            for( int i=1; i<=n;i++)
            {
                //space
                for( int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                //numbers
                for( int j=1;j<=i;j++)
                {
                        System.out.print(i+" ");
                }
                  System.out.println();
            }

       //output
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5





//             int n=5;
            for( int i=1; i<=n;i++)
            {
                //space
                for( int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                //print number
                for(int j=i; j>=1;j--)
                {
                    System.out.print(j);
                }
                //second line
                for(int j=2; j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
       // output     
//     1
//    212
//   32123
//  4321234
// 543212345





  
//             int n=4;
            for( int i=1; i<=n;i++)
            {
                //space
                for( int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for( int j=1;j<=2*i-1;j++)
                {
                      System.out.print(" * ");
                }
                System.out.println();
            }
            for( int i=n; i>=1;i--)
            {
                //space
                for( int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for( int j=1;j<=2*i-1;j++)
                {
                      System.out.print(" * ");
                }
                System.out.println();
            }

//             //output
//       * 
//    *  *  *
//   *  *  *  *  *
//  *  *  *  *  *  *  *
//  *  *  *  *  *  *  *
//   *  *  *  *  *
//    *  *  *
//     *





            

        }
    }
    
}
