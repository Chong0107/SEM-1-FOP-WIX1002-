public class Point extends CreditCard{

    public Point(String name, String cardNo) {
        super(name, cardNo);
        typeOfCard = "Point Reward";
    }

    public void getReward(String day,double price){
        switch (day){
            case "Friday":
                setTotalReward(getTotalReward() + (Math.floor(price) * 2) / 100 );
                break;
            case "Saturday":
                setTotalReward(getTotalReward() + (Math.floor(price) * 3) / 100);
                break;
            case "Sunday":
                setTotalReward(getTotalReward() + (Math.floor(price) * 4) / 100);
                break;
            default:
                setTotalReward(getTotalReward() + (Math.floor(price)) / 100);
                break;
        }
    }
}
