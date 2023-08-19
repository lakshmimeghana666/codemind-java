import java.util.Scanner;
public class two{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,max;
        a=sc.nextInt();
        b=sc.nextInt();
        max=(a>b)?a:b;
        while(true)
        {
            if((max%a==0)&&(max%b==0))
            {
                System.out.printf("%d",max);
                break;
            }
            ++max;
        }
    }
}