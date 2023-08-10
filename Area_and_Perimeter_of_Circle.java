import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r;
        double a,p;
        r=sc.nextInt();
        a=3.14*r*r;
        p=2*3.14*r;
        System.out.printf("%.2f
",a);
        System.out.printf("%.2f",p);
        
    }
}
