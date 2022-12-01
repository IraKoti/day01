package myapp;

import java.io.Console;

public class Variables {
   public static void main(String[] args) 
   {
        Console cons = System.console();
        String name = "";
        while(name.trim().length() <=0 )
        {
            name = cons.readLine("What is your name?");
        }
        //if(name == "fred")
        // == is meant for numbers
        if(name.equals("Fred"))
        {
            System.out.println("Yabadabadoo");
        }
        else if(name.equals("batman"))
        {
            System.out.println("I am the Dark Knight");
        }
        else if(name.equals(""))
        {
            System.err.println("Please enter your name (if)");
        }
        else
        {
            System.out.println(name);
            //System.out.printf("Hello %s. Please to meet you.\n",name);

        }


        switch (name.trim().toLowerCase())
        {
            case "fred":
            System.out.println("Yabadabadoo");
            break;
            
            case "":
            System.err.println("Please Enter your name");
            break;
        }
   }
}
