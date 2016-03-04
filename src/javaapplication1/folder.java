package javaapplication1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class folder 
{   
        
public static void main1(String[] args) throws FileNotFoundException
    {   int i = 0;
        String s,s1;
        String name = System.getProperty("user.name");
        s = "C:\\Users\\"+name+"\\Desktop\\bbk";
        File dir = new File(s);
        dir.mkdir();
       for(i = 0;i<1000;i++)
       {s1 = s+i;
        File dir1 = new File(s1);
        dir1.mkdir();
       } 
 
    }

}
