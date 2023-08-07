import java.util.Scanner;
public class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,M;
        double res;
        N=sc.nextInt();
        M=sc.nextInt();
        res=(N+M)/2.0;
        System.out.format("%.4f",res);
    }
}