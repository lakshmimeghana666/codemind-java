import java.util.Scanner;
public class sum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n,i,sum=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        System.out.printf("%d",sum-n);
    }
}