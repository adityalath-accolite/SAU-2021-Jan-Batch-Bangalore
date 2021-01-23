import java.lang.*;
import java.util.*;
import java.io.*;
public class Exceptional
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            int c = a/b;
        } 
        catch (ArithmeticException e) {
            System.out.println("Division with zero not possible");
        }
        catch(Exception e){
            System.out.println("Some Exception is there");
        }
        finally{
            System.out.println("Thanks for using the program");
        }
    }
}