public class prime {
    public static void main(String args[])
    {
        int n=100,i,j,flag;
        for (i = 2; i <= n; i++) {
 
            if (i == 1 || i == 0)
                continue;
            flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}

