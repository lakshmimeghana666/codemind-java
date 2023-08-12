import java.util.Scanner;
public class hand{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=(n*(n-1))/2;
        System.out.printf("%d",b);
    }
}