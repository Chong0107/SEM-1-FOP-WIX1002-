public class L8Q5 {
    public static void main(String[] args) {
        Game game1 = new Game("John Tee");
        Game game2 = new Game("Mohd Arif");
        int round = 1;
        while(true){
            System.out.println("Round "+round);
            game1.roll();
            if(game1.win())
                break;
            game2.roll();
            if(game2.win())
                break;
            round++;
            System.out.println();
        }
    }
}
