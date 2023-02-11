import java.util.Scanner;
class demo10
{
    public static void main(String[] ar)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the range ");
        int t1=0;
        int t2=1;
        int nexterm=t1+t2;
        int i=0;
        int num=scan.nextInt();
        System.out.print(t1+" " +t2);
        while(i<num)
        {
            t1=t2;
            t2=nexterm;
            nexterm=t1+t2;
            System.out.print(" "+nexterm);
            i++;
        }
    
    }
}