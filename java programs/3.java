import java.util.Scanner;
class demo3
{
    public static void main(String[] a)
    {
        String rev="";
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER STRING");
        String str=scan.nextLine();
        StringBuilder temp=new StringBuilder();
       for(int i=str.length()-1;i>-1;i--)
       {
        rev+=str.charAt(i);
       }
       if(str.equals(rev))
       {
        System.out.println("IT IS A PALIDROM");
       }
       else
       {
        System.out.println("IT IS NOT PALIDROM");
       }

    }
}