/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Random;

/**
 * define card value and suits
 *
 * @modifier Syed Dawood Ahmed
 * @studentId 991648160
 * @author sivagamasrinivasan
 */
public class Card {

    private int value;
    private String suits; //encapsulation
    //constant
    public static final String[] SUITS = {"diamonds", "clubs", "spades", "hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
    
    //Method to Generate Random Number from 1 to 13.
    Random rand = new Random();
    public int randomNum() {
        return rand.nextInt(13) + 1;
    }
    
    //Method to select rendom suits
    public String randomSuits(){
    int index = rand.nextInt(SUITS.length);
    return SUITS[index]; 
    }
}
