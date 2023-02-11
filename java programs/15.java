import java.util.Scanner;
class demo15
{
    public static void main(String[] a)
    {
        int sum=0;
        Scanner scan=new Scanner(System.in);
        int num=0;
        System.out.println("enter the range");
        num=scan.nextInt();
        while(num>0)
        {
            sum+=(num+Math.pow(num,2));
            num--;
        }
        System.out.println("sum of square n natural numbers :- "+sum);

    }
}