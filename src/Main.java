public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Джордж", "Оруэлл");
        Author secondAuthor = new Author("Джордж", "Мартин");
        Book firstBook = new Book(firstAuthor, "1984", 2014);
        Book secondBook = new Book(secondAuthor, "Песнь Льда и Огня", 1996);
        secondBook.setPublishingYear(2018);
        System.out.println(firstBook.getAuthor() + ": " + firstBook.getBookName() + ": " + firstBook.getPublishingYear());
        System.out.println(secondBook.getAuthor() + ": " + secondBook.getBookName() + ": " + secondBook.getPublishingYear());
    }

}