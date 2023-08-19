import java.util.Scanner;
public class n
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        for(int n=i*2;n>=2;n=n-2)
        {
            System.out.printf("%d ",n);
        }
    }
}