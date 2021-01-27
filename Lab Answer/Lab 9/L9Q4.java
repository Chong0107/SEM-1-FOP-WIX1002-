public class L9Q4 {
    public static void main(String[] args) {
        DiceGame1 player1 = new DiceGame1("Daniel");
        DiceGame1 player2 = new DiceGame1("John");
        System.out.println("* Dice Game 1 * \n");
        int round = 1;
        while(player1.getScore() < 100 && player2.getScore() < 100){
            System.out.println("Round "+round);
            player1.roll();
            if(player1.getScore() >= 100) {
                System.out.println("Congratulations, " + player1.getName() + " WIN!!!");
                break;
            }
            player2.roll();
            if(player1.getScore() >= 100){
                System.out.println("Congratulations, " + player2.getName() + " WIN!!!");
                break;
            }
            round++;
            System.out.println();
        }

        System.out.println("\n\n");

        DiceGame2 player3 = new DiceGame2("Ahmad");
        DiceGame2 player4 = new DiceGame2("Rolex");
        int round2 = 1;
        System.out.println("* Dice Game 2 * \n");
        while (player3.getScore() < 100 && player4.getScore() < 100){
            System.out.println("Round "+round2);
            player3.roll();
            if(player3.getScore()==100){
                System.out.println("Congratulations, "+player3.getName()+" WIN1!!!");
                break;
            }
            player4.roll();
            if (player4.getScore()==100){
                System.out.println("Congratulations, "+player4.getName()+" WIN1!!!");
                break;
            }
            round2++;
            System.out.println();
        }
    }
}
