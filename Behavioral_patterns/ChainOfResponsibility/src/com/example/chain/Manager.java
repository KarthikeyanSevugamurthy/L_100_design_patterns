class Manager extends Approver {
    public void approveRequest(int days) {
        if (days <= 5) {
            System.out.println("Manager approved leave for " + days + " days.");
        } else if (nextApprover != null) {
            nextApprover.approveRequest(days);
        }
    }
}