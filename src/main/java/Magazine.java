class Magazine extends AbstractMedia {
    private int issueNumber;

    public Magazine(String title, String description, int issueNumber) {
        super(title, description);
        this.issueNumber = issueNumber;
    }

    public void displayIssueNumber() {
        System.out.println("Issue Number: " + issueNumber);
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        displayIssueNumber();
    }
}