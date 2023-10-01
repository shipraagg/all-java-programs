public class armstrong {
    public static void main(String args[])
    {
        int n=121,temp, digits=0, last=0, sum=0;     
        temp=n;   
        while(temp>0)    
        {   
            temp = temp/10;   
            digits++;   
        }   
        temp = n;   
        while(temp>0)   
        {        
            last = temp % 10;   
            sum +=  (Math.pow(last, digits));      
            temp = temp/10;   
        } 
        if(sum==n)
        {
            System.out.println("armstrong number");
        } 
        else{
            System.out.println("not armstrong no");
        }
}
    
}
