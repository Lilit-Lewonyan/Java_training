package Sincronized;

public class SincAccount {
    private  int number;
    private  int money;

    public SincAccount(int number, int money){
        this.money = money;
        this.number = money;
    }

    public int getNumber() {
        return number;
    }

    public int getMoney() {
        return money;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void Withdraw(int amount){
        money-=amount;

    }
}
