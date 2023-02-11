import java.util.Scanner;
class demo11
{
    public static void main(String[] ar)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the celsius");
        float num =scan.nextFloat();
        float far=num*9/5+32;
        System.out.println("fahrenheat is :- "+far );


    }
}