import java.util.Random;

public class Game {
    private final String name;
    private int score = 0;
    private final Random r = new Random();

    public Game(String name) {
        this.name = name;
    }

    public void roll(){
        int dice = r.nextInt(6)+1;
        System.out.println(this.name+" rolls "+dice);
        this.score += dice;
        System.out.println("Current score: "+this.score);
    }

    public boolean win(){
        if(this.score >= 100)
            System.out.print("\n"+"Congratulations, "+this.name+" WINS!!!");
        return this.score >= 100;
    }
}
