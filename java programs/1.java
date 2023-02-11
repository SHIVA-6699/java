import java.util.Scanner;
class demo1
{
    static int sum=0;
    public static void main(String[] a)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the range");
        int num=scan.nextInt();
        System.out.println("n natural number :- ");
        while(sum<num)
        {
            System.out.println(sum);

            sum++;


            
        }
       
    }

}