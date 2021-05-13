package Enum;

public enum Enviroment {
    PROD("prod url"),PREPROD("preprod url"), STAGE("stage url"), AUTOMATION("automation url");
    private String url;

    Enviroment(String url){
        this.url = url;

    }

    public String getURL(){
        return url;
    }
}
