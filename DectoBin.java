import java.util.*;
import java.io.*;
public class DectoBin
{
    public static int findBinary(int decimal, String result)
    {
        //base case
        if(decimal==0)
            return Integer.valueOf(result);

        result=decimal%2 + result;
        return findBinary(decimal/2, result);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int dec=sc.nextInt();
        int binary=findBinary(dec,"");
        System.out.print(binary);
    }
}