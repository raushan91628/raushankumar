abstract class bank {
    abstract int getrateofinterest(); 
}
 class SBI extends  bank{
    int getrateofinterest(){
        return 7;
    }
}
    class PNB extends bank{
        int getrateofinterest(){
            return 8;
        }
    }
  class bank{
        public static void main(String[] args)
        {
            bank b;
            b=new SBI();
            System.out.println("Rate of intest:-" +b.getrateofinterest()+" % ");
            b=new PNB();
            System.out.println("Rate of intest:-" +b.getrateofinterest()+" % ");
            
        }
    }

