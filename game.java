// Guess Number Game Using Java

import java.util.*;
class Game{
    int number;     // range of number
    int guess;      // player by guess number
    int attempt;    // how many attempt to guess number
    
 // Constructor to generate random number
    Game(){
        Random r= new Random();
       number=r.nextInt(100)+1;
       attempt=0; 
    }

 // Method to take user input
    void takeUserInpute(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number 1 To 100:  ");
        guess=sc.nextInt();

    }

// Method to check if the guess is correct
    boolean isCorrectNumber(){
        attempt++;
        if(guess==number){
            System.out.println("Number is Correct! ");
            System.out.println("You guessed it in " + attempt + " attempts.");
            return true;
        }else if(guess<number){
            System.out.println("Number Is To less...");
            
        }else{
            System.out.println("Number Is To High...");
        }
        return false;
         
    }
}

    

class game{
    public static void main(String[] args) {
        Game obj=new Game();          // Create game object
        boolean isCorrect=false;     // Initial state
        
    // Keep asking until correct number is guessed
        while (!isCorrect) {
            obj.takeUserInpute();
            isCorrect = obj.isCorrectNumber();
    }
  }
}