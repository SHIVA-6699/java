import java.util.Scanner;
class demo5
{
    static int sum=0;
    public static void main(String[] a)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        float num=scan.nextFloat();
       int i=0;
        while(i<=num/2)
        {
           

            if(num%i==0)
            {
                sum+=i;
            }
            i++;

            
        }
       
      if(num==sum)
      System.out.println("the perfect number is:- "+sum);
      else
      System.out.println("this is not perfect number");
       
    }

}