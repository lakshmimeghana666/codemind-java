import java.util.Scanner;
public class last
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=a%100;
        System.out.printf("%02d",b);
    }
}