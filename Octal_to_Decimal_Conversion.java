import java.util.Scanner;
public class octal{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(Integer.parseInt(a,8));
    }
}