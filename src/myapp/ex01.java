package myapp;

import java.io.Console;

public class ex01 {
    public static void main(String[] args) 
    {
        Console cons = System.console();
        String answer  = "";
        int totalanswer = 0;
        /*boolean answerBoo = false;
        while (answerBoo == false)
        {
            answer = cons.readLine("Enter a number: ");
            if(answer.trim().toLowerCase().equals("stop"))
            {
                answerBoo = true;
            }
            else
            {
                totalanswer = totalanswer + Integer.parseInt(answer);
            }
            
        }*/
        while(!answer.trim().toLowerCase().equals("stop"))
        {
            answer = cons.readLine("Enter a number: ");
            if(!answer.trim().toLowerCase().equals("stop"))
            {
                totalanswer += Integer.parseInt(answer);
            }           
        }
        //System.out.println("the total is "+Integer.toString(totalanswer));
        System.out.printf("The total is %d", totalanswer);
    }
    
}
