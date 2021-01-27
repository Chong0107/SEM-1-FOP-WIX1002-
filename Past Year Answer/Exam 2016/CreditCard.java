public class CreditCard {
    private final String name;
    private final String cardNo;
    protected String typeOfCard;
    private double totalReward;

    public CreditCard(String name, String cardNo) {
        this.name = name;
        this.cardNo = cardNo;
    }

    public double getTotalReward() {
        return totalReward;
    }

    public void setTotalReward(double totalReward) {
        this.totalReward = totalReward;
    }

    public String toString(){
        String display;
        display = "Credit Card: "+name+"("+cardNo+")"+"\nCard Type: "+typeOfCard;
        display += String.format("\nTotal Cash Reward: %.4f" ,totalReward);
        return display;
    }
}
