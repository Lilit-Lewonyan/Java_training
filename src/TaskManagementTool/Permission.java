package TaskManagementTool;

public class Permission {
    private boolean isAllowedCraeteSprint;
    private boolean isAllowedUpdateReleseNoteStatus;
    private boolean isAllowedAddTickettoSprint;
    private boolean isAllowedEditTiket;
    private boolean isAllowedDeleteTiket;

    /*
    Setter Methods
     */
    public void setIsAllowedCraeteSprint(boolean isAllowedCraeteSprint) {
        this.isAllowedCraeteSprint = isAllowedCraeteSprint;
    }

    protected void setAllowedUpdateReleseNoteStatus(boolean isAllowedUpdateReleseNoteStatus){
        this.isAllowedUpdateReleseNoteStatus = isAllowedUpdateReleseNoteStatus;
    }

    protected void setAllowedEditTiket(boolean isAllowedEditTiket){
        this.isAllowedEditTiket = isAllowedEditTiket;
    }

    protected void setAllowedAddTickettoSprint(boolean isAllowedAddTickettoSprint){
        this.isAllowedAddTickettoSprint = isAllowedAddTickettoSprint;
    }

    protected void setAllowedDeleteTiket(boolean isAllowedDeleteTiket){
        this.isAllowedDeleteTiket = isAllowedDeleteTiket;
    }

    /*
    Getter methods
     */
    public boolean getisAllowedCraeteSprint() {
        return isAllowedCraeteSprint;
    }

    public boolean getisAllowedUpdateReleseNoteStatus() {
        return isAllowedUpdateReleseNoteStatus;
    }

    public boolean getisAllowedAddTickettoSprint() {
        return isAllowedAddTickettoSprint;
    }

    public boolean getisAllowedEditTiket() {
        return isAllowedEditTiket;
    }

    public boolean getisAllowedDeleteTiket() {
        return isAllowedDeleteTiket;
    }

}
