package TeardPackage;

public class TreadClass extends Thread{
    TreadClass(int num){
    System.out.println(num);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("rinning thread");
    }
}
