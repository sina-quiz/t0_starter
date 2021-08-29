package ir.ac.kntu;

public class Bank {

    public Bank() {
    }

    public Boolean payWithCash(Costumer costumer,int cost){
        if(cost>costumer.getCash()){
            return false;
        } else{
            costumer.setCash(costumer.getCash()-cost);
            costumer.totalCalculator();
            return true;
        }
    }

    public Boolean payWithCredit(Costumer costumer,int cost){
        if((cost/2)>costumer.getCreditCard()){
            return false;
        } else{
            costumer.setCreditCard(costumer.getCreditCard()-(cost/2));
            costumer.totalCalculator();
            return true;
        }

    }
}

