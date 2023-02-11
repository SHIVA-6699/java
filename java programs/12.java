import java.util.Scanner;
class demo12
{
    public static void main(String[] a)
    {
        System.out.println("enter us dollars");
        Scanner scan=new Scanner(System.in);
        float money=scan.nextInt();
        float IND = money*82.5224f;


        System.out.println("IND RUPPES :- "+IND);
    }
}