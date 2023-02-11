import java.io.IOException;

class demo8
{
    public static void main(String[] ar)throws IOException
    {
        System.out.println("enter the character");
        int num=System.in.read() ;
        System.out.printf("the ascii value of %c is %d",num,num);
        
    }
}