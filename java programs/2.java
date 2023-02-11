import java.util.Scanner;
class demo2
{
    static int sum=0;
    public static void main(String[] a)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the range");
        int num=scan.nextInt();
        while(num>0)
        {
            sum+=num;
            num--;

        }
        System.out.println("SUM OF NATURAL NUMBERS :- "+sum);
    }

}