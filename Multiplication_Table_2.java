import java.util.Scanner;
public class m
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m;
        for(int i=1;i<=b;i++)
        {
           m=i*a;
           System.out.printf("%d x %d = %d
",a,i,m);
        }
    }
}