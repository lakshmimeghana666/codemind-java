import java.util.Scanner;
public class take{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.next().charAt(0);
        if(n=='V'||n=='v')
        {
            System.out.printf("Violet");
        }
        else if(n=='I'||n=='i')
        {
            System.out.printf("Indigo");
        }
        else if(n=='B'||n=='b')
        {
            System.out.printf("Blue");
        }
        else if(n=='G'||n=='g')
        {
            System.out.printf("Green");
        }
        else if(n=='Y'||n=='y')
        {
            System.out.printf("Yellow");
        }
        else if(n=='O'||n=='o')
        {
            System.out.printf("Orange");
        }
        else if(n=='R'||n=='r')
        {
            System.out.printf("Red");
        }
        else
        {
            System.out.printf("-1");
        }
    }
}
