
package week.pkg10;

public class L8Q5 {
    public static void main(String[] args) {
        Game player1 = new Game("John");
        Game player2 = new Game("Lim");
        int round = 1;
        while(true){
            System.out.println("Round "+round);
            player1.roll();
            if(player1.display())
                break;
            player2.roll();
            if(player2.display())
                break;
            round++;
            System.out.println();
        }
    }
}
