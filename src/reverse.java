public class reverse {
    public static void main(String args[])
    {
        int num=123,result=0,rem;
        while(num!=0)
        {
            rem=num%10;
            result=result*10+rem;
            num=num/10;
        }
        System.out.println("reverse number is: "+result);
    }
}
