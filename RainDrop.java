import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0 && n%5==0)
        {
            System.out.printf("PlingPlang");
        }
        else if(n%3==0)
        {
            System.out.printf("Pling");
        }
        else if(n%5==0)
        {
            System.out.printf("Plang");
        }
        else if(n%7==0)
        {
            System.out.printf("Plong");
        }
        else
        {
            System.out.printf("%d",n);
        }
    }
}