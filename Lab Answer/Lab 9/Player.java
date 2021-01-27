public class Player {
    protected int score;
    protected String name;

    public Player() {
    }

    public Player(String a) {
        name = a;
    }

    public void display(){
        System.out.println("The score for "+name+" is "+score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
