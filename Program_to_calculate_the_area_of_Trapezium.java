import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double b1=sc.nextInt();
        double b2=sc.nextInt();
        double h=sc.nextInt();
        double a=((b1+b2)*h)/2.0;
        System.out.printf("%.4f",a);
    }
}
