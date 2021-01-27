import java.util.Random;

public class DiceGame1 extends Player{
    private int dice1,dice2;
    private Random r = new Random();

    public DiceGame1(String a) {
        super(a);
    }

    public void roll(){
        this.dice1 = 0;
        this.dice2 = 0;
        while (this.dice1 == this.dice2){
            this.dice1 = this.r.nextInt(6)+1;
            this.score += this.dice1;
            this.dice2 = this.r.nextInt(6)+1;
            this.score += this.dice2;
            System.out.println(this.getName()+" rolls "+this.dice1+" and "+this.dice2);
            this.display();
        }
    }
}
