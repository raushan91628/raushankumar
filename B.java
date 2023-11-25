 class A{
     int a; double b; String c;
   public  A()
    {
        a=100; b=24.25; c="Raushan";
    }
        A(int x)
        {
           a=x;
        }
        A(double y,String z)
        {
            b=y; c=z;
        }
    }
        class B{
        public static void main(String[] args)
        {
            A r=new A();
            A r2=new A(10);
            A r3=new A(25.52,"raushan");
            System.out.print(r.a+" "+r.b+" "+r.c);
            System.out.print(r2.a);
            System.out.print(r3.b+" "+r3.c);
        }

        }
    

