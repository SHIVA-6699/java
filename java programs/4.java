import java.util.Scanner;
class demo4
{
    public static void main(String[] a)
  {
    int rev=0;
    int temp;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number");
    int num =scan.nextInt();
    int rel=num;
    while(rel!=0)
    {
        temp=rel%10;
        rev=rev+(temp*temp*temp);
        rel/=10;

    }
    if(rev==num)
    System.out.println("THE ARMSTRONG NUMBER IS:-"+rev);
    else
    System.out.println(rev+"  THIS NOT ARMSTRONG NUMBER");
  }
}