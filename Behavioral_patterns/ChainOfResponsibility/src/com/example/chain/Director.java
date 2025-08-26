class Director extends Approver {
    public void approveRequest(int days) {
        if (days <= 10) {
            System.out.println("Director approved leave for " + days + " days.");
        } else if (nextApprover != null) {
            nextApprover.approveRequest(days);
        }
    }
}