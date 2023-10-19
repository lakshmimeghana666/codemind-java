import java.util.Scanner;
public class d
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int S=sc.nextInt();
        int B=sc.nextInt();
        int a=2*T*S*B*512;
        int s=a/1024;
        System.out.printf("%d KB",s);
    }
}