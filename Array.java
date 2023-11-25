import java.util.*;
public class Array {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int size=sc.nextInt();
        int number[] = new int[size];
        // marks[0]=35;
        // marks[1]=354;
        // marks[2]=356;
       // int marks[]={24,54,54,};
       for(int i=0;i<size;i++)
       {
        number[i]=sc.nextInt();
       }
       int x= sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(number[i]==x)
            {
System.out.println("found the number-" +i);
            }
        //
        // System.out.print(marks[1]);
        // System.out.print(marks[2]);
        }
    }
}
    
}
