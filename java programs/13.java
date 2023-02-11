import java.util.Scanner;
class demo13
{
 public static void main(String[] ar)
{
    int sum=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number");
    int num=scan.nextInt();
    int  num1=(int)(Math.pow(num,2));
    while(num1!=0)
    {
        int digit=num1%10;
         sum +=digit;
        num1/=10;
    }
    if(sum==num)
    {
        System.out.println("this is neon number");
    }
    else
    {
        System.out.println("this is not neon number");
    }

}

}