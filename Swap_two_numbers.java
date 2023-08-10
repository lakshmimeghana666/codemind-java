import java.util.Scanner;
public class swap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        a=b;
        b=a;
        System.out.printf("%d",a);
        System.out.printf("
%d ",c);
    }
}