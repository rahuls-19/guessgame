package tutorial;
import java.util.Scanner;
import java.util.Random;
public class Tutorial {
   
    public static void main(String[] args) {
        int max,number,guess=0,count=0; 
        
       Scanner scan;
       Random rand;
       scan = new Scanner(System.in);
       rand = new Random();
       System.out.println("please enter the limit of the number you want to guess");
       max = scan.nextInt();
       number = rand.nextInt(max);
       
       while(number != guess){
           System.out.println("Guess the number ");
           guess = scan.nextInt();
       if(guess > number ){
           System.out.println("number is too high");
           count++;
           
       }
        if (guess < number){
           System.out.println("number is too low");
           count++;
       }
       
       
       
       }
       System.out.println("You win and You Take " + count +" changes to guess");
    }
    
}
