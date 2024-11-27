abstract class AbstractMedia implements Media {
    protected String title;
    protected String description;

    public AbstractMedia(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public void displayTitle() {
        System.out.println("Title: " + title);
    }

    @Override
    public void displayDescription() {
        System.out.println("Description: " + description);
    }
}
