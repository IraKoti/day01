package myapp;

public class Iarray {
    public static void main(String[] args) {
        String[] tasks = new String[3];
        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";
        for(int a=0; a<tasks.length; a++) 
        {
            System.out.printf("%s ",tasks[a]);    
        }
        
    }
    
}
