
package javaapplication1;


import java.io.File;

import java.io.IOException;

public class executer
{ 
    public static void main1(String[] args) throws IOException
    {
       String s = "C:\\Program Files (x86)\\Arduino\\arduino.exe";
      // String s = "F:\\software\\MusicBeeSetup_2_4.exe";
        File app = new File(s);
      
        if(! app.exists())
            {
                throw new IllegalArgumentException("file " + s + " does not exist");
            }
        else 
            {
                System.out.println("opening\"file\"..");
                Process pros = Runtime.getRuntime().exec(app.getAbsolutePath());
            
            }
    }
}
