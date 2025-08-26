public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        teamLead.approveRequest(2);   // Team Lead approves
        teamLead.approveRequest(4);   // Manager approves
        teamLead.approveRequest(8);   // Director approves
        teamLead.approveRequest(15);  // CEO approves
    }
}