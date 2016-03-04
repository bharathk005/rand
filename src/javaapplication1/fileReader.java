package javaapplication1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileReader 
{
public static void main1(String[] args) throws FileNotFoundException
    {
        File n = new File("C:\\Users\\"+"bharathk"+"\\Documents\\MyFirstC++\\logs.txt");
        Scanner reader = new Scanner(n);
             while(reader.hasNextLine())
             System.out.println(reader.nextLine());
    
    }

}
