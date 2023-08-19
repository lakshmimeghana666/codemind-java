import java.util.Scanner;
public class three{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n,s;
        i=sc.nextInt();
        for(n=1;n<=i;n++)
        {
            s=n*3;
            System.out.printf("%d ",s);
        }
    }
}