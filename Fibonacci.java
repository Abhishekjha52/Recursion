//program to calculate fibonacci series using recursion
import java.util.*;
import java.io.*;
public class Fibonacci {
    public static int fibo(int n)
    {
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        //int res=fibo(n);
        System.out.println("Fibonacci number at n position is: "+fibo(n));
    }
    
}
