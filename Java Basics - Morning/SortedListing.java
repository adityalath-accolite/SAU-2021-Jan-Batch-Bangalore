import java.lang.*;
import java.util.*;
import java.io.*;
public class SortedListing
{
    public static void main(String[] args) throws IOException
    {
        List<Integer> list = Arrays.asList(1,8,5,4,7);
        Collections.sort(list);
        System.out.println(list);
    }
}