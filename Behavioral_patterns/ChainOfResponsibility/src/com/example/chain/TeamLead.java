class TeamLead extends Approver {
    public void approveRequest(int days) {
        if (days <= 2) {
            System.out.println("Team Lead approved leave for " + days + " days.");
        } else if (nextApprover != null) {
            nextApprover.approveRequest(days);
        }
    }
}