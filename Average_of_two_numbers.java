import java.util.Scanner;
public class d
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        double n=(float)(n1+n2)/2.0;
        System.out.printf("Average of %d and %d is: %.2f",n1,n2,n);
    }
}