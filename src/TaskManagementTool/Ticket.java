package TaskManagementTool;

public class Ticket {
    protected int number;
    protected User reporter;
    protected String title;

    public void creat(int number,User reporter,String title){
        this.number = number;
        this.reporter = reporter;
        this.title = title;

    }
}
