public class fibonacci {
    public static void main(String args[])
    {
        int num=10,num1=0,num2=1,num3;
        System.out.println(num1);
        System.out.println(num2);
        for(int i=2;i<num;i++)
        {
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
    }
    
}
