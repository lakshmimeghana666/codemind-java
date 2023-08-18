import java.util.Scanner;
public class day{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int y=d/365;
        int w=(d-y*365)/7;
        System.out.printf("%d
",y);
        System.out.printf("%d",w);
    }
}