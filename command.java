public class command {
    public static void main(String[] args)
    {
        int i;
        double s=0;
        if(args.length==0)
        {
            System.out.println("No Argument sent:");
            System.exit(0);
        }
        for(i=0;i<args.length;i++)
        {
            System.out.print(args[i]);
       
           s = s + Double.parseDouble(args[i]);

        }
        System.out.println("sum of sent values=" +s);
    }
}
