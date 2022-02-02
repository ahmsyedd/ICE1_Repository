/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Scanner;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan
 */
public class CardTrickICE1 {

    /**
     * branch
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(c1.randomNum());
            c1.setSuits(c1.randomSuits());
            magicHand[i] = c1;
        }
        
        //step 2:take input 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Suit name of the card");
        String userSuit = input.next();
        System.out.println("Enter the Rank number of the card:");
        int userValue = input.nextInt();
        
        
        
        
        //step 3: match with array 
    }
    
}
