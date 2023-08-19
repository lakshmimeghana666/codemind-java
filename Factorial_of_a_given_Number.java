import java.util.Scanner;
public class f{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,f=1;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.printf("%d",f);
    }
}