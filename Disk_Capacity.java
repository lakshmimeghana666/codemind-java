import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=512*a*b*c*2;
        System.out.printf("%d",d);
    }
}