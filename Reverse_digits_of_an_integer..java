import java.util.Scanner;
public class an{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,r,q,s=0;
        n=sc.nextInt();
        q=n;
        while(q!=0)
        {
            r=q%10;
            q=q/10;
            s=s*10+r;
        }
        System.out.printf("%d",s);
    }
}