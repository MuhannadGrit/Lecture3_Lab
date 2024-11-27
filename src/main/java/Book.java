class Book extends AbstractMedia {
    private String author;

    public Book(String title, String description, String author) {
        super(title, description);
        this.author = author;
    }

    public void displayAuthor() {
        System.out.println("Author: " + author);
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        displayAuthor();
    }
}