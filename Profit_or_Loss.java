import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(b>a)
        {
            System.out.printf("Profit");
        }
        else if(a>b)
        {
            System.out.printf("Loss");
        }
        else{
            System.out.printf("No profit and No loss");
        }
    }
}