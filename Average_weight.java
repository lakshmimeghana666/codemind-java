import java.util.Scanner;
public class avg{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x,b1,b2,b3;
        x=sc.nextInt();
        b1=sc.nextInt();
        b2=sc.nextInt();
        b3=3*x-b1-b2;
        System.out.printf("%d",b3);
    }
}
