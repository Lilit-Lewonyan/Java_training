package TaskManagementTool;

abstract public class Ticket {
    protected int number;
    protected User reporter;
    protected String title;

   abstract public void creat(int number,User reporter,String title);
}
