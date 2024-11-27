public class LibraryDemo {
    public static void main(String[] args) {
        Media myBook = new Book("Java Basics", "An introduction to Java programming", "John Doe");
        Media myMagazine = new Magazine("Tech Today", "Latest tech trends", 2024);

        displayMedia(myBook);
        displayMedia(myMagazine);
    }

    public static void displayMedia(Media media) {
        media.displayTitle();
        media.displayDescription();
    }
}