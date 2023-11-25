//  class MyThread extends Thread
// {
//     String s;
//     MyThread(String ss,int p)
//     {
//         setPriority(p);
//         s=ss;
//         start();
//     }
//     public void run()
//     {
//         for(int i=1;i<=3;i++)
//         {
//             System.out.println(s+i);
//             try{
//                 Thread.sleep(1000);
//             }
//             catch(Exception e)
//             {}
//         }
//     }
// }
// class test
// {
//     public static void main(String[] args)
//     {
//     MyThread t1=new MyThread("Alpha",Thread.MAX_PRIORITY);
//     MyThread t2=new MyThread("Bita",Thread.NORM_PRIORITY);
//     MyThread t3=new MyThread("Gamma",Thread.MIN_PRIORITY);
// }
// }


class MyThread implements Runnable
{
    Thread t;
String s;
MyThread(String ss)
{
    t=new Thread(this);
    s=ss;
}
public void  run()
{
    for( int i=1;i<=3;i++)
    {
        System.out.println(s+i);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
        }
    }
}
}
class test
{
    public static void main(String[] args)
    {
        MyThread t1=new MyThread("Alpha");
           MyThread t2=new MyThread("Bita");
           t1.t.start();
           t2.t.start();
    }
}
