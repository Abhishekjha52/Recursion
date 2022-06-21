import java.util.*;
import java.io.*;
public class Palindrome{
    public static boolean isPalindrome(String s)
    {
        //base case
        if(s.length()==0 || s.length()==1)
            return true;

        if(s.charAt(0)==s.charAt(s.length()-1))
            return isPalindrome(s.substring(1,s.length()-1));

        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        if(isPalindrome(s)==true)
            System.out.println("It is palindrome!!");
        else
            System.out.println("No it is not palindrome!!");
    }
}