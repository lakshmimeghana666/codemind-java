import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int H=m/60;
        m=m%60;
        System.out.printf("%d Hour(s) ",H);
        System.out.printf("%d Minute(s)",m);
    }
}
