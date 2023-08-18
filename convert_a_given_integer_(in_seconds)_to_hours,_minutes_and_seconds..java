import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int h=(s/3600);
        int m=(s-(3600*h))/60;
        s=(s-(3600*h)-(m*60));
        System.out.printf("H:M:S-%d:%d:%d",h,m,s);
    }
}