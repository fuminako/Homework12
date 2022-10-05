public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Джордж", "Оруэлл");
        Author secondAuthor = new Author("Джордж", "Мартин");
        Book firstBook = new Book(firstAuthor, "1984", 2014);
        Book secondBook = new Book(secondAuthor, "Песнь Льда и Огня", 1996);
        secondBook.setPublishingYear(2018);

        Book[] book = new Book[5];
        book[0] = firstBook;
        for(int i = 0; i<book.length; i++) {
            if (book[i] == null) {
                book[i] = secondBook;
                break;
            }
        }
        for (int i = 0; i<book.length; i++) {
            if (book[i] != null) {
                System.out.println(book[i]);
            }
        }
    }
}