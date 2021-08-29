package ir.ac.kntu;

public class Costumer {

    private int creditCard;

    private int cash;

    private int total;

    public Costumer(int creditCard, int cash) {
        this.creditCard = creditCard;
        this.cash = cash;
        totalCalculator();
    }

    public void totalCalculator(){
        total = cash+creditCard;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
