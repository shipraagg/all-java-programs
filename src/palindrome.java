public class palindrome {
    public static void main(String args[])
    {
        int num=121,result=0,rem,p;
        p=num;
        while(num!=0)
        {
            rem=num%10;
            result=result*10+rem;
            num=num/10;
        }
        if(p==result)
        {
        System.out.println(" number is palindrome : "+result);
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
    
}
