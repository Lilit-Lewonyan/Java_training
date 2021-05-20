package TeardPackage;

public class TeardMain {

    public static void main(String[] args) {
         TreadClass newClass = new TreadClass(1);
        TreadClass newClass1 = new TreadClass(2);
        TreadClass newClass2 = new TreadClass(3);
        TreadClass newClass3 = new TreadClass(4);
         newClass.start();
        System.out.println("end first example");



        Thread thread = new Thread(new RunnableClass(1));
        Thread thread1 = new Thread(new RunnableClass(2));
        Thread thread2 = new Thread(new RunnableClass(3));
        Thread thread3 = new Thread(new RunnableClass(4));

        System.out.println("end second example");



//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("rinning thread");
//            }
//        };

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("running thread");
            }
        });
        thread4.start();
        System.out.println("end bllbla example");


    }
}
