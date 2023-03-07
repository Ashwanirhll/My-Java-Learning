import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.Scanner;
public class GuessNumber {
static void GuessNumber(){
    Scanner sc=new Scanner(System.in);
    int number=1+(int)(100*Math.random());
    int i,chances=5;
    System.out.println("You have got "+chances+" chances to guess the number.");
    for( i=0;i<chances;i++){
        System.out.print("Enter your guess between 1 to 100:");
        int guess=sc.nextInt();
        if(guess==number){
            System.out.println("Wohoo! You have guessed it right...");
        }
        else if(number>guess && i!=5){
            System.out.println("The number is greater than "+guess);
        }
        else if(number<guess && i!=5)
        System.out.println("The number is less than "+guess);
         
    }
    if(i==chances)
    System.out.println("Oops! you have failed to guess the number...");
}
public static void main(String[] args) {
    GuessNumber();
}    
    
}
