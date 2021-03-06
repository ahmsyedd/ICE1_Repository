/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Scanner;
/** 
 * @modifier Syed Dawood Ahmed
 * @studentId 991648160
 * @author sivagamasrinivasan
 */
public class CardTrickICE1 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card luckyCard = new Card();
        luckyCard.setSuits("hearts");
        luckyCard.setValue(10);
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(c1.randomNum());
            c1.setSuits(c1.randomSuits());
            magicHand[i] = c1;
        }
        
        //step 2: take input 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Suit name of the card");
        String userSuit = input.next();
        System.out.println("Enter the Rank number of the card:");
        int userValue = input.nextInt();
        
        System.out.println("Your Entered Card Suit is "+ userSuit + " and Card Number is "+ userValue);

        //step 3: match with array
        int matched = 0;
        for(int i=0; i<magicHand.length;i++)
        {
            if(userSuit.equalsIgnoreCase(magicHand[i].getSuits()) && userValue==magicHand[i].getValue()) {
                System.out.println("Congratulations!! Your card is found.");
                matched = 1;
                break;
            }
        }
        
        if(matched == 0) {
            System.out.println("Try again! Your card was not found");
        }
    
    }
    
}
