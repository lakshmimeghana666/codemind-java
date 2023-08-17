import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b<c||b+c<a||c+a<b)
            {
                System.out.printf("YES
");
            }
            else
            {
                System.out.printf("NO
");
            }
        }
    }
}
