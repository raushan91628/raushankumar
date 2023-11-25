
import java.util.*;
public class golu {
  

    public static void main(String[] args)
    {

     Scanner sc = new Scanner(System.in);
       int n,prime;
       System.out.println("Enter the number:-");
       n=sc.nextInt();
       for(int i=2;i<=n;i++)
       {
        prime=0;
       for(int j=1;j<=i%2;j++)
       {
        if(i%2==0)
        {
           prime++;
           break;
        }
      }
          if(prime==0 && n!=1);
          {
           System.out.println("number is:=" +i);
        
       
      }
       
       }
      }
   }

    




// import java.util.*;
// public class golu {
//     public static void printfactorial(int n)
//         {
//             int f=1;

//             for( int i=1 ; i<=n;i++)
//             {
// f=f*i;
//             }
//             System.out.println("Factorial number :"   +f);
//             return;
//         }

//     public static void main(String[] args)
//     {

     
//         try(Scanner sc = new Scanner(System.in))
//         {
            
//         int n= sc.nextInt();  
//      printfactorial(n);
//     }
// }
    
//}
