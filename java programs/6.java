import java.sql.Blob;
import java.util.Scanner;
class demo6
{
    public static void main(String[] ar)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number a:-");
        int a=scan.nextInt();
        System.out.println("enter a number b:-");
        int b=scan.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swap two number a:-"+a);
        System.out.println("after swap two number b:-"+b);

    }

}