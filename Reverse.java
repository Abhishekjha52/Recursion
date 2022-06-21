//Java Program to reverse a string using recursion
import java.util.*;
import java.io.*;
public class Reverse {
    public static String reversedString(String s)
    {
        //base case
        if(s.equals(""))
            return "";

        return reversedString(s.substring(1))+s.charAt(0);

        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        String ans=reversedString(s);
        System.out.println(ans);
    }


    
}
