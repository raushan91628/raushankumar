public class abc {
    public static void main(String[] args)
    {
//         String firstname = "raushan";
//         String lastname = "Kumar";
//         String fullname = firstname + lastname;
//         int age = 23;
//         int a = 25;
//         int b = 25;
//         int sum = a+b;
//        // int diff = b-a;
// System.out.println("name is=" +fullname.length());
// System.out.println("Age is=" +age);
// System.out.println("sum of number is=" +sum);

StringBuilder sb = new StringBuilder("Raushan");
for(int i=0;i<sb.length()/2;i++)

{
    int front = i;
    int back = sb.length()-1-i;
    char frontChar = sb.charAt(front);
    char backChar = sb.charAt(back);
    sb.setCharAt(front , backChar);
    sb.setCharAt(back , frontChar);
}

    System.out.println(sb);

// System.out.println(sb.charAt(1));
// sb.setCharAt(0,'r');
// System.out.println(sb);
// sb.insert(2,'n');
// System.out.println(sb);
// //delete
// sb.delete(2,4);
// System.out.println(sb);


//string adding
// sb.append("h");
// sb.append("e");
// sb.append("l");
// System.out.println(sb);


    }
    
}
