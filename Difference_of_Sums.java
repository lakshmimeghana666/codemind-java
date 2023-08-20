import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,x=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+i*i;
            x=x+i;
        }
        x=x*x;
        {
            if(s>x)
            {
                n=s-x;
                System.out.printf("%d",n);
            }
            else if(s<x)
            {
                n=x-s;
                System.out.printf("%d",n);
            }
        }
    }
}