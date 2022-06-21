//program for sum of natural numbers using recursion
import java.util.*;
import java.io.*;
public class SumOfNatNum{
    public static int recursiveSummation(int n)
    {
        //base case
        if(n<=1)
            return n;
        return n+(recursiveSummation(n-1));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print(recursiveSummation(n));
    }
}