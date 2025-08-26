class CEO extends Approver {
    public void approveRequest(int days) {
        if (days > 10) {
            System.out.println("CEO approved leave for " + days + " days.");
        }
    }
}