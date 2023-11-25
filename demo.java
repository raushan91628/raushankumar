import java.util.*;

class demo{
    public static void main(String[] args)
    {
  try( Scanner sc = new Scanner(System.in))
  {
System.out.println("Enter the number");
int a = sc.nextInt();
int b = sc.nextInt();
if(a==b)
{
    System.out.println("equal" );
}else  if(a>b){ 
    System.out.println("A is grater" );
}else{
    System.out.println("B is grater" );
    
}

  }

        //System.out.println("sum of number=" +sum);
    }
}