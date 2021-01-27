public class L8Q7 {
    public static void main(String[] args) {
        money money1 = new money(555);
        money1.roundUp();
        money1.calculate();
        money1.display();

        money money2 = new money(51);
        money2.roundUp();
        money2.calculate();
        money2.display();

        money substractMoney = money.addtion(money1,money2);
        substractMoney.calculate();
        substractMoney.display();

        money addMoney = money.substraction(money1,money2);
        addMoney.calculate();
        addMoney.display();
    }
}
