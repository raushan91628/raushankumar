import java.util.*;
public class fac {
    public static void main(String[] args)
    {
try(Scanner sc = new Scanner(System.in))
{
int n, f=1,i;
System.out.print("Enter the number:-");
 n = sc.nextInt();
for(i=1;i<=n;i++)
{
    f=f*i;
}
System.out.println("Factrial of number:-" +f);
}
    }
    
}
