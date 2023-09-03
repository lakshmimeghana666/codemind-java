import java.util.Scanner;
public class P
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int s=0;
        for(int i=1;i<n;i++)
        {
            r=n%i;
            if(r==0)
            {
                s+=i;
            }
        }
        if(s==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}