import java.util.Scanner;
public class area{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double s,area;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        s=(float)(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}