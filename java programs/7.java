import java.util.Scanner;


class demo7
{
    
    public static void main(String[] ar)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int num=scan.nextInt();
        int fac=1;
        int i=1;

        while(i<=num)
        {
            fac=fac*i;
            i++;
        }
        System.out.println("factorail of given number:-"+fac);
    }
}