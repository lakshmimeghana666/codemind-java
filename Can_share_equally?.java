import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int r=x-2*y;
         if(x==0 && y%2==0 )
        {
            System.out.printf("YES");
        }
        else if(x==0 && y%2!=0)
        {
            System.out.printf("NO");
        }
        else if(r%2==0)
        {
            System.out.printf("YES");
        }
        else 
        {
            System.out.printf("NO");
        }
    }
}
