package Sincronized;

public class SincronizedMain {
    public static void main(String[] args) {
        SincAccount account1 = new SincAccount(123,1200);

        SincTranzaction tranzaction1 = new SincTranzaction(1000,account1);
        SincTranzaction tranzaction2 = new SincTranzaction(800,account1);
        Thread thread1 = new Thread(tranzaction1);
        thread1.start();
        Thread thread2 = new Thread(tranzaction2);
        thread2.start();
    }



}
