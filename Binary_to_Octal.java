import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            String a=sc.next();
            int x=Integer.parseInt(a,2);
            System.out.printf(Integer.toString(x,8));
            System.out.printf("
");
        }
    }
}
