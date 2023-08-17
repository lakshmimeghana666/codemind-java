import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double b,h,d;
        b=sc.nextDouble();
        h=sc.nextDouble();
        d=sc.nextDouble();
        double PF=(12*b)/100;
        double G=(b+h+d+PF);
        System.out.printf("%.2f
",PF);
        System.out.printf("%.2f",G);
    }
}
