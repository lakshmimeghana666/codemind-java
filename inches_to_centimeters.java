import java.util.Scanner;
public class inches{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        double cm;
        i=sc.nextInt();
        cm=i*2.54;
        System.out.printf("%.2f",cm);
        
    }
}