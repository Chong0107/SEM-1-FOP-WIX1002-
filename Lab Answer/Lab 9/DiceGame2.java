import java.util.Random;

public class DiceGame2 extends Player{
    private int dice;
    private Random r = new Random();

    public DiceGame2(String a) {
        super(a);
    }

    public void roll(){
        this.dice = this.r.nextInt(6)+1;
        this.score += this.dice;
        System.out.println(this.getName()+" rolls "+this.dice);
        // score more than 100 (no count)
        if(this.score>100){
            this.score -= this.dice;
        }
        this.display();

        if(this.dice == 6){
            this.dice = this.r.nextInt(6)+1;
            System.out.println(this.getName()+" rolls "+this.dice);

            if(this.dice != 6){
                this.score += this.dice;
                // score more than 100 (no count)
                if(this.score>100){
                    this.score -= this.dice;
                }
                this.display();
            }
            else{
                // roll 6 not count
            }
        }

    }
}
