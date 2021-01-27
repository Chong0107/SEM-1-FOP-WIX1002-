
package week.pkg10;

import java.util.Random;

public class Game {
    private String name;
    private int score = 0;

    public Game(String name) {
        this.name = name;
    }
    
    public void roll(){
        Random r = new Random();
        int dice = r.nextInt(6)+1;
        System.out.println(this.name+" rolls "+dice+".");
        this.score += dice;
        System.out.println("Current score: "+this.score);
    }
    
    public boolean display(){
        if(this.score >= 100)
            System.out.println("\nCongratulations, "+this.name+" WIN!!!");
        return this.score>=100;
    }
}
