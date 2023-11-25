import java.util.Scanner;
interface clind
{
    void input();
    void output();
}
    class raushan implements clind{
        String name;
        double salery;
      public  void input()
        {
            Scanner r=new Scanner(System.in);
            System.out.print("Enter the username :");
            name=r.nextLine();
            System.out.print("Enter the salery :");
            salery=r.nextDouble();

        }
     public   void output()
        {
            System.out.print("Name of users:-"name);
            System.out.print("Salary of users:-"salery);
            
        }
        public static void main(String[] args)
        {
            clind c= new raushan();
            c.input();
            c.output();
        }
    }
