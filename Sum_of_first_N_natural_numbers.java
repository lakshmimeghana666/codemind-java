import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int N=n*(n+1)/2;
        System.out.printf("%d",N);
    }
}
