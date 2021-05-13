package Enum;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println(getURL(Enviroment.PREPROD));
    }

    public static String getURL(Enviroment enviroment) {
        switch (enviroment) {
            case PROD,PREPROD,STAGE,AUTOMATION:
                return enviroment.getURL() ;
            default:
                return "incorrect";
        }
    }
}
