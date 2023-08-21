import java.util.Scanner;
public class m
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,s,i;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(i=b;i<=c;i++)
        {
            s=a*i;
        System.out.printf("%d x %d = %d
",a,i,s);
        }
    }
}