import java.util.Scanner;
class demo9
{
    public static void main(String[] ar)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the range");
        int num= scan.nextInt();
        int i,j;
        System.out.println("the prime numbers are:-");
        for(i=2;i<num;i++)
        {
            for( j=2;j<i;j++)
            {
                if(i%2==0)
                {
                    break;
                }
            }
            if(i==j)
             {
                System.out.println(i);

             }
            
        }
    }
}