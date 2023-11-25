import java.util.*;

public class hello 
{  
public static void main(String args[])  
{  
 
try(Scanner sc = new Scanner(System.in)){  
System.out.print("Enter the first number: ");  
int x = sc.nextInt();  
System.out.print("Enter the second number: ");  
int y = sc.nextInt();  
int sum  = x + y;  
System.out.println(sum);  
}
}   
}
    

