package Sincronized;

public class SincTranzaction  implements Runnable {
 private int money;
 private SincAccount account;

    public SincTranzaction(int money, SincAccount account) {
        this.money = money;
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (account){
            if(account.getMoney()>money){
                account.setMoney(account.getMoney()-money);
                System.out.println("success");
            }else
                System.out.println("not enough funds");
        }
    }
}
