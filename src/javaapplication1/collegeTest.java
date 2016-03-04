package javaapplication1;
import java.util.Scanner;
import java.util.Random;

public class collegeTest 
{
    public static void main1(String[] args)
    {   Random rand = new Random();
        Scanner ins = new Scanner(System.in);
        System.out.println("number of departments?");   
        int n = ins.nextInt();
        college c1 = new college();
  
        c1.setdep(n);
        c1.setfees(rand.nextInt(10));
        c1.setlocation("Trichy");
        c1.setname("NIT");
        c1.display();
     
    }
}
