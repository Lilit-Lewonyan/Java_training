public class lesson5 {
    public static void main(String[] args) {
        int[] arrtask = new int[500];
        for (int i = 0; i < 500; i++) {
            arrtask[i] = i + 1;
        }

//        for (int element : arrtask) {
//            if (element == 340) {
//                break;
//            }
//            if (element%2!=0) {
//                System.out.println(element);
//            }
//
//
//        }

        for (int element : arrtask) {
            if (element % 3 == 0 || element % 5 == 0 || element % 8 == 0) {
                System.out.println(element);
            }


        }
    }

        public static void printodds(){


        }

}
