import java.util.Scanner;
public class count{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,c=0;
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=m;i<=n;i++)
        {
            if(i%3==0&&i%2==0)
            {
                c++;
            }
        }
        System.out.printf("%d",c);
    }
}