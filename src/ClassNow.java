public class ClassNow {
    public static void main(String[] args) {
        //////////////////////////////
        char x = 'x';
        char y = 'y';
        int raw =0;
        char[][] shax = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                shax [i][j]= x;
            }

        }

        char initvalue = x;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if(i==0 && j==0){
                    shax[i][j] = y;
                    initvalue = x;
                }
                if (initvalue==x){
                    shax[i][j] = y;
                    initvalue = shax[i][j];
                }
                else
                {
                    shax[i][j] = x;
                    initvalue = shax[i][j];
                }

                System.out.print(shax[i][j]);
            }
            if(initvalue==x){
                initvalue =y;
            }
            else
                initvalue =x;
            System.out.println();
        }

    }
}
