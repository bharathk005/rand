
package javaapplication1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class filewriter 
{
    public static void main1(String[] args)
    {
        String s1,s2;
        Scanner in = new Scanner(System.in);
        System.out.println("enter s1");
        s1 = in.next();
        System.out.println("enter s2");
        s2 = in.next();
        try{
        FileWriter write = new FileWriter("C:\\Users\\bharathk\\Desktop\\mine.txt");
        BufferedWriter bf = new BufferedWriter(write);
        bf.write("string one is:"+s1);
        bf.newLine();
        bf.write("string two is:"+s2);
        bf.close();
        }catch(Exception e)
         {
            System.err.println(e.getMessage());
         }
    }
}
