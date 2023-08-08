import java.util.Scanner;
public class temp{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c;
        double x;
        c=sc.nextInt();
        x=(float)(32+(c*1.8));
        System.out.printf("%.2f",x);
    }
}