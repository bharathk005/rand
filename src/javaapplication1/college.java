
package javaapplication1;


public class college 
{

   static int no_of_departments;
    String name;
    String location;
    int fees;
    
    college() 
    {
        no_of_departments =0;
        name = null;
        location = null;
        fees = 0;
    }
    
    public void setdep(int n)
    {no_of_departments = n;
    }
    public void setname(String s)
    {name = s;
    }
    public void setfees(int f)
    {fees = f;
    }
   
    public void setlocation(String l)
    {location = l;
    }
    public void display()
    { System.out.println("Name:"+name);
      System.out.println("Location:"+location);
      System.out.println("Fees:"+fees);
      System.out.println("dep:"+no_of_departments);
    }
}
